package com.sem2.sem2_project.service;

public interface EmailService {
    void sendOrderConfirmation(String to, String orderDetails);
}
