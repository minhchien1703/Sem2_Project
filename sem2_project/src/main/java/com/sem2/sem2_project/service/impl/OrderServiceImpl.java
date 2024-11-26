package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.ProductOrderRequest;
import com.sem2.sem2_project.dto.request.OrderUpdateStatusRequest;
import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.OrderDetailsResponse;
import com.sem2.sem2_project.dto.response.OrderResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.repository.*;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final StatusRepository statusRepository;
    private final ProductRepository productRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final PaymentRepository paymentRepository;
    private final AuthenticationService authenticationService;
    private double totalAmount = 0;

    @Override
    public OrderResponse createOrder(OrderRequest orderRequest) {
        User user = userRepository.findById(orderRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found" + orderRequest.getUserId()));

        Status status = statusRepository.findById(orderRequest.getStatusId())
                .orElseThrow(() -> new RuntimeException("Status not found" + orderRequest.getStatusId()));

        Payment payment = paymentRepository.findById(orderRequest.getPaymentMethodId())
                .orElseThrow(() -> new RuntimeException("Payment not found" + orderRequest.getPaymentMethodId()));

        // create order
        Order order = BasicMapper.INSTANCE.orderRequestToOrder(orderRequest);
        order.setPayment(payment);
        order.setUser(user);
        order.setStatus(status);

        List<ProductOrderRequest> productOrderRequests = orderRequest.getProductOrderRequests();
        for (ProductOrderRequest productOrderRequest : productOrderRequests) {
            totalAmount += productOrderRequest.getPrice() * productOrderRequest.getQuantity();
        }
        order.setTotalAmount(totalAmount);
        Order savedOrder = orderRepository.save(order);

//add orderDetails
        List<OrderDetails> orderDetailsList = new ArrayList<>();

        for (ProductOrderRequest productOrderRequest : productOrderRequests) {
            OrderDetails orderDetails = new OrderDetails();
            Product product = productRepository.findById(productOrderRequest.getProductId())
                    .orElseThrow(() -> new RuntimeException("Product not found" + productOrderRequest.getProductId()));

            orderDetails.setOrder(savedOrder);
            orderDetails.setProducts(product);
            orderDetails.setQuantity(productOrderRequest.getQuantity());
            orderDetails.setPrice(productOrderRequest.getPrice());
            orderDetailsList.add(orderDetailsRepository.save(orderDetails));
        }

//        convert orderDetails to response
        List<OrderDetailsResponse> orderDetailsResponses = orderDetailsList.stream()
                .map(orderDetails -> {
                    OrderDetailsResponse response = new OrderDetailsResponse();
                    response.setId(orderDetails.getId());
                    response.setProductName(orderDetails.getProducts().getName());
                    response.setProductDescription(orderDetails.getProducts().getDescription());
                    response.setQuantity(orderDetails.getQuantity());
                    response.setPrice(orderDetails.getPrice());
                    return response;
                })
                .collect(Collectors.toList());

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(savedOrder.getId());
        orderResponse.setUserId(user.getId());
        orderResponse.setShippingAddress(savedOrder.getShippingAddress());
        orderResponse.setPaymentName(payment.getMethodName());
        orderResponse.setStatus(savedOrder.getStatus().getStatus());
        orderResponse.setUserName(savedOrder.getUser().getUsername());
        orderResponse.setDate(savedOrder.getDate());
        orderResponse.setTotalAmount(savedOrder.getTotalAmount());
        orderResponse.setOrderDetails(orderDetailsResponses);
        return orderResponse;
    }

    @Override
    public boolean updateOrder(int id, OrderUpdateStatusRequest request) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found" + id));

        Status status = statusRepository.findById(request.getStatusId())
                .orElseThrow(() -> new RuntimeException("Status not found" + request.getStatusId()));

        order.setStatus(status);
        orderRepository.save(order);
        return true;
    }

    @Transactional
    @Override
    public boolean deleteOrder(int orderId) {
        if (orderRepository.existsById(orderId)) {
            List<OrderDetails> orderDetailsList = orderDetailsRepository.findByOrderId(orderId);
            for (OrderDetails orderDetails : orderDetailsList) {
                orderDetailsRepository.deleteByOrderId(orderDetails.getOrder().getId());
            }
            orderRepository.deleteById(orderId);
            return true;
        }
        throw new RuntimeException("Order not found" + orderId);
    }


    @Override
    public List<OrderResponse> getAllOrders() {
        User user = authenticationService.getCurrenAuthenticatedUser();
        System.out.println(user.getId() + " " + user.getUsername() + " " + user.getEmail());
        log.error("User id: {}", user.getId());
        List<Order> orders = orderRepository.findByUserId(user.getId());

        List<OrderResponse> orderResponses = new ArrayList<>();

        for (Order order : orders) {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setId(order.getId());
            orderResponse.setUserId(order.getUser().getId());
            orderResponse.setUserName(order.getUser().getUsername());
            orderResponse.setDate(order.getDate());
            orderResponse.setTotalAmount(order.getTotalAmount());
            orderResponse.setStatus(order.getStatus().getStatus());
            orderResponse.setShippingAddress(order.getShippingAddress());
            orderResponse.setPaymentName(order.getPayment().getMethodName());

            List<OrderDetails> orderDetailsList = orderDetailsRepository.findByOrderId(order.getId());
            List<OrderDetailsResponse> orderDetailsResponses = new ArrayList<>();

            for (OrderDetails oDetail : orderDetailsList) {
                OrderDetailsResponse orderDetailsResponse = new OrderDetailsResponse();
                orderDetailsResponse.setId(oDetail.getId());
                orderDetailsResponse.setProductName(oDetail.getProducts().getName());
                orderDetailsResponse.setProductDescription(oDetail.getProducts().getDescription());
                orderDetailsResponse.setQuantity(oDetail.getQuantity());
                orderDetailsResponse.setPrice(oDetail.getPrice());
                orderDetailsResponses.add(orderDetailsResponse);
            }
            orderResponse.setOrderDetails(orderDetailsResponses);
            orderResponses.add(orderResponse);
        }
        return orderResponses;
    }

}
