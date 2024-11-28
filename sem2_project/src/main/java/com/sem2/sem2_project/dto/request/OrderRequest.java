package com.sem2.sem2_project.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {
    double totalAmount;
    String shippingAddress;
    int paymentMethodId;
    int statusId;
    List<Integer> productIds;
}
