package com.sem2.sem2_project.dto.response;

import lombok.Data;

@Data
public class UserResponse {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
}
