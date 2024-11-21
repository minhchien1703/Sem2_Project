package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.OrderResponse;

import java.util.List;

public interface OrderService {
    OrderResponse createOrder(OrderRequest orderRequest);

    OrderResponse updateOrder(int id, OrderRequest orderRequest);

    boolean deleteOrder(int orderId);

    List<OrderResponse> getAllOrders();
}
