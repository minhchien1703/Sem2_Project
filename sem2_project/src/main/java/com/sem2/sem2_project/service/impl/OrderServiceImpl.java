package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.OrderUpdateStatusRequest;
import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.*;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.enums.CartStatus;
import com.sem2.sem2_project.repository.*;
import com.sem2.sem2_project.repository.projection.PaymentProjection;
import com.sem2.sem2_project.repository.projection.UserProjection;
import com.sem2.sem2_project.service.AuthenticationService;
import com.sem2.sem2_project.service.EmailService;
import com.sem2.sem2_project.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    private final EmailService emailService;
    private final CartSummaryServiceImpl cartSummaryServiceImpl;
    private final ImageRepository imageRepository;

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

        order = orderRepository.save(order);
        CartSummary cartSummary = cartSummaryServiceImpl.createCartSummary(order.getId(), orderRequest.getUserId());

        order.setTotalAmount(cartSummary.getTotal());
        order = orderRepository.save(order);

        List<Cart> carts = cartRepository.findCartByUserId(user.getId(), CartStatus.ACTIVE);
        for (Cart item : carts) {
            Product product = productRepository.findById(item.getProduct().getId())
                    .orElseThrow(() -> new RuntimeException("Product not found"));
            double productTotal = product.getPrice() * item.getQuantity();
            OrderDetails orderDetails = new OrderDetails(order, product, item.getQuantity(), productTotal);
            orderDetailsRepository.save(orderDetails);
            item.setOrder(order);
            item.setStatus(CartStatus.DELETED);
            cartRepository.save(item);
        }
        emailService.sendOrderConfirmation("chienminh1703@gmail.com", "Your order number 38HF654DWR confirm success!");
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
    public List<OrderResponse> getOrderByUserId() {
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
            orderResponse.setCreatedAt(order.getCreatedAt());

            orderResponses.add(orderResponse);
        }
        return orderResponses;
    }

    @Override
    public UserProjection getInfoUser(int userId) {
        return userRepository.findUserProjectionById(userId);
    }

    @Override
    public List<PaymentProjection> getInfoPayments() {
        return paymentRepository.findAllPayments();
    }

    @Override
    public OrderDetailsResponse orderDetails(int orderId, int userId) {
        OrderDetailsResponse orderDetailsResponse = new OrderDetailsResponse();

        Order order = orderRepository.findByOrderAndUserId(orderId, userId);
        orderDetailsResponse.setOrderId(order.getId());
        orderDetailsResponse.setShippingAddress(order.getShippingAddress());

        Payment payment = paymentRepository.findById(order.getPayment().getId())
                .orElseThrow(() -> new RuntimeException("Payment not found"));
        orderDetailsResponse.setPaymentName(payment.getMethodName());

        List<Cart> carts = cartRepository.findByOrderUserId(orderId, userId, CartStatus.DELETED);
        List<CartResponse> cartResponses = new ArrayList<>();
        for (Cart cart : carts) {
            CartResponse cartRes = new CartResponse();
            Optional<Product> product = productRepository.findById(cart.getProduct().getId());
            if (product.isPresent()) {
                ProductResponse productRes = BasicMapper.INSTANCE.toProductResponse(product.get());
                productRes.setStatus(product.get().getStatus());

                Images image = imageRepository.findImagesByProductId(product.get().getId());
                if (image != null) {
                    productRes.setImage(image.getUrl());
                }
                cartRes.setId(cart.getId());
                cartRes.setQuantity(cart.getQuantity());
                cartRes.setProduct(productRes);
                cartRes.setColor(product.get().getColor());
                cartRes.setSize(product.get().getSize());
                cartRes.setSubTotal(cart.getSubTotal());
                cartResponses.add(cartRes);
            }
        }
        orderDetailsResponse.setOrderDetails(cartResponses);
        return orderDetailsResponse;
    }

}
