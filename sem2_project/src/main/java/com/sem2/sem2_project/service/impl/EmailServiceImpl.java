package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
    private final JavaMailSender emailSender;

    @Override
    public void sendOrderConfirmation(String to, String orderDetails) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("black4ngel1998@gmail.com"); // Replace with your email
        message.setTo(to);
        message.setSubject("Order Confirmation");
        message.setText("Thank you for your order!\n\n" + orderDetails); // Include order details
        emailSender.send(message);
    }
}
