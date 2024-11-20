package com.sem2.sem2_project.dto.request;

import lombok.Data;

@Data
public class RegisterRequest {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String phone;
}
