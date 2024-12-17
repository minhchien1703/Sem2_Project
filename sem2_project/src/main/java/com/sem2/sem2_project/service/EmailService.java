package com.sem2.sem2_project.service;

public interface EmailService {
    public void sendOrderConfirmation(String to, String orderDetails);
}
