package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.response.*;
import com.sem2.sem2_project.model.Status;
import com.sem2.sem2_project.service.ColorService;
import com.sem2.sem2_project.service.OrderService;
import com.sem2.sem2_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/basic")
public class BasicController {
    private final ProductService productService;
    private final OrderService orderService;

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        return ResponseEntity.ok(productService.getCategories());
    }

    @GetMapping("/sizes")
    public ResponseEntity<List<SizeResponse>> getAllSizes() {
        return ResponseEntity.ok(productService.getSizes());
    }

    @GetMapping("colors")
    public ResponseEntity<List<ColorResponse>> getAllColors() {
        return ResponseEntity.ok(productService.getColors());
    }

    @GetMapping("/materials")
    public ResponseEntity<List<MaterialResponse>> getAllMaterials() {
        return ResponseEntity.ok(productService.getMaterials());
    }

    @GetMapping("/rooms")
    public ResponseEntity<List<RoomResponse>> getAllRooms() {
        return ResponseEntity.ok(productService.getRooms());
    }

    @GetMapping("/orderstatus")
    public ResponseEntity<List<Status>> getAllOrderStatus() {
        return ResponseEntity.ok(orderService.getOrderStatuses());
    }

}
