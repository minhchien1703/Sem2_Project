package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.OrderUpdateStatusRequest;
import com.sem2.sem2_project.dto.request.OrderRequest;
import com.sem2.sem2_project.dto.response.OrderResponse;

import java.util.List;

public interface OrderService {
    String createOrder(OrderRequest orderRequest);

    boolean updateOrder(int id, OrderUpdateStatusRequest Request);

    boolean deleteOrder(int orderId);

    List<OrderResponse> getAllOrders();
}
