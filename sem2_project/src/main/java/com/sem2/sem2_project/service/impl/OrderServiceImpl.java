package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.OrderResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Order;
import com.sem2.sem2_project.model.OrderDetails;
import com.sem2.sem2_project.model.Status;
import com.sem2.sem2_project.model.User;
import com.sem2.sem2_project.repository.OrderDetailsRepository;
import com.sem2.sem2_project.repository.OrderRepository;
import com.sem2.sem2_project.repository.StatusRepository;
import com.sem2.sem2_project.repository.UserRepository;
import com.sem2.sem2_project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final StatusRepository statusRepository;
    private final OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderResponse createOrder(OrderRequest orderRequest) {
        User user = userRepository.findById(orderRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found" + orderRequest.getUserId()));

        Status status = statusRepository.findById(orderRequest.getStatusId())
                .orElseThrow(() -> new RuntimeException("Status not found" + orderRequest.getStatusId()));

        Order order = BasicMapper.INSTANCE.toOrderRequest(orderRequest);

        List<OrderDetails> orderDetails = orderDetailsRepository.findByOrderId(order.getId());

        order.setUser(user);
        order.setOrderDetails(orderDetails);
        order.setStatus(status);
        order.setDate(LocalDateTime.now());
        Order savedOrder = orderRepository.save(order);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(savedOrder.getId());
        orderResponse.setUserId(savedOrder.getUser().getId());
        orderResponse.setUserName(savedOrder.getUser().getUsername());
        orderResponse.setDate(savedOrder.getDate());
        orderResponse.setTotalAmount(savedOrder.getTotalAmount());
        orderResponse.setShippingAddress(orderRequest.getShippingAddress());
        orderResponse.setPaymentMethod(savedOrder.getPaymentMethod());
        orderResponse.setStatus(status.getStatus());
        return orderResponse;
    }

    @Override
    public OrderResponse updateOrder(int id, OrderRequest orderRequest) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found" + id));

        Status status = statusRepository.findById(orderRequest.getStatusId())
                .orElseThrow(() -> new RuntimeException("Status not found" + orderRequest.getStatusId()));

        User user = userRepository.findById(orderRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found" + orderRequest.getUserId()));

        order.setUser(user);
        order.setStatus(status);
        order.setDate(LocalDateTime.now());
        order.setTotalAmount(orderRequest.getTotalAmount());
        order.setShippingAddress(orderRequest.getShippingAddress());
        order.setPaymentMethod(orderRequest.getPaymentMethod());
        Order savedOrder = orderRepository.save(order);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(savedOrder.getId());
        orderResponse.setUserId(savedOrder.getUser().getId());
        orderResponse.setUserName(savedOrder.getUser().getUsername());
        orderResponse.setDate(savedOrder.getDate());
        orderResponse.setTotalAmount(savedOrder.getTotalAmount());
        orderResponse.setShippingAddress(orderRequest.getShippingAddress());
        orderResponse.setPaymentMethod(savedOrder.getPaymentMethod());
        orderResponse.setStatus(status.getStatus());
        return orderResponse;
    }


    @Override
    public boolean deleteOrder(int orderId) {
        if (orderRepository.existsById(orderId)) {
            orderRepository.deleteById(orderId);
            return true;
        }
        throw new RuntimeException("Order not found" + orderId);
    }

    @Override
    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        List<OrderResponse> orderResponses = new ArrayList<>();

        for (Order order : orders) {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setId(order.getId());
            orderResponse.setUserName(order.getUser().getUsername());
            orderResponse.setUserId(order.getUser().getId());
            orderResponse.setDate(order.getDate());
            orderResponse.setTotalAmount(order.getTotalAmount());
            orderResponse.setShippingAddress(order.getShippingAddress());
            orderResponse.setPaymentMethod(order.getPaymentMethod());
            orderResponse.setStatus(order.getStatus().getStatus());
            orderResponses.add(orderResponse);
        }
        return orderResponses;
    }
}
