package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.OrderDetailsRequest;
import com.sem2.sem2_project.dto.response.OrderDetailsResponse;

public interface OrderDetailsService {
    OrderDetailsResponse addOrderDetails(OrderDetailsRequest orderDetailsRequest);

    OrderDetailsResponse getOrderDetail(int id);
}
