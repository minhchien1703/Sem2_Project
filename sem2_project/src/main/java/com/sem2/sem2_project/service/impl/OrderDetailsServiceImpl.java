package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.OrderDetailsRequest;
import com.sem2.sem2_project.dto.response.OrderDetailsResponse;
import com.sem2.sem2_project.dto.response.OrderResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Order;
import com.sem2.sem2_project.model.OrderDetails;
import com.sem2.sem2_project.model.Product;
import com.sem2.sem2_project.repository.OrderDetailsRepository;
import com.sem2.sem2_project.repository.OrderRepository;
import com.sem2.sem2_project.repository.ProductRepository;
import com.sem2.sem2_project.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDetailsServiceImpl implements OrderDetailsService {
    private final OrderDetailsRepository orderDetailsRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Override
    public OrderDetailsResponse addOrderDetails(OrderDetailsRequest orderDetailsRequest) {
        Order order = orderRepository.findById(orderDetailsRequest.getOrderId())
                .orElseThrow(() -> new RuntimeException("Order not found" + orderDetailsRequest.getOrderId()));

        Product product = productRepository.findById(orderDetailsRequest.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found" + orderDetailsRequest.getProductId()));

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setPrice(orderDetailsRequest.getPrice());
        orderDetails.setOrder(order);
        orderDetails.setProducts(product);
        OrderDetails savedOrderDetails = orderDetailsRepository.save(orderDetails);

        OrderDetailsResponse orderDetailsResponse = new OrderDetailsResponse();
        orderDetailsResponse.setId(savedOrderDetails.getId());
        orderDetailsResponse.setOrderId(savedOrderDetails.getId());
        orderDetailsResponse.setProductName(product.getName());
        orderDetailsResponse.setProductDescription(product.getDescription());
        orderDetailsResponse.setQuantity(orderDetails.getQuantity());
        orderDetailsResponse.setPrice(orderDetails.getPrice());
        return orderDetailsResponse;
    }

    @Override
    public OrderDetailsResponse getOrderDetail(int id) {
        return BasicMapper.INSTANCE.toOrderDetailsResponse(
                orderDetailsRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found" + id)));
    }
}
