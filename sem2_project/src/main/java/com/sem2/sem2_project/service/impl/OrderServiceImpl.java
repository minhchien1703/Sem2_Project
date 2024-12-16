package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.OrderUpdateStatusRequest;
import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.OrderDetailsResponse;
import com.sem2.sem2_project.dto.response.OrderResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.CartStatus;
import com.sem2.sem2_project.repository.*;
import com.sem2.sem2_project.repository.projection.PaymentProjection;
import com.sem2.sem2_project.repository.projection.UserProjection;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final StatusRepository statusRepository;
    private final ProductRepository productRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final PaymentRepository paymentRepository;
    private final AuthenticationService authenticationService;
    private final CartRepository cartRepository;
    private final UserRepository userRepository;
    private final CartSummaryRepository cartSummaryRepository;

    @Override
    public String createOrder(OrderRequest orderRequest) {
        User user = authenticationService.getCurrenAuthenticatedUser();
        Status status = statusRepository.findById(1)
                .orElseThrow(() -> new RuntimeException("Status not found"));
        Payment payment = paymentRepository.findById(orderRequest.getPaymentMethodId())
                .orElseThrow(() -> new RuntimeException("Payment not found"));

        Order order = new Order();
        order.setMessage(orderRequest.getMessage());
        order.setShippingAddress(orderRequest.getShippingAddress());
        order.setPayment(payment);
        order.setUser(user);
        order.setStatus(status);
        CartSummary cartSummary = cartSummaryRepository.findCartSummaryByUser(user.getId());
        order.setTotalAmount(cartSummary.getTotal());
        order = orderRepository.save(order);

        List<Cart> carts = cartRepository.findCartByUserId(user.getId(), CartStatus.ACTIVE);
        for (Cart item : carts) {
           Product product = productRepository.findById(item.getProduct().getId())
                   .orElseThrow(() -> new RuntimeException("Product not found"));
            Cart cart = cartRepository.findCartByProductIdAndUserId(product.getId(), user.getId());
            double productTotal = product.getPrice() * cart.getQuantity();
            OrderDetails orderDetails = new OrderDetails(order, product, cart.getQuantity(), productTotal);
            orderDetailsRepository.save(orderDetails);
            cartRepository.delete(cart);
        }
        return "Create order successful";
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
        List<Order> orders = orderRepository.findByUserId(user.getId());

        List<OrderResponse> orderResponses = new ArrayList<>();
        for (Order order : orders) {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setId(order.getId());
            orderResponse.setUserId(order.getUser().getId());
            orderResponse.setUserName(order.getUser().getUsername());
            orderResponse.setDate(order.getCreatedAt());
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

    @Override
    public UserProjection getInfoUser() {
        User user = authenticationService.getCurrenAuthenticatedUser();
        return userRepository.findUserProjectionById(user.getId());
    }

    @Override
    public List<PaymentProjection> getInfoPayments() {
        return paymentRepository.findAllPayments();
    }

}
