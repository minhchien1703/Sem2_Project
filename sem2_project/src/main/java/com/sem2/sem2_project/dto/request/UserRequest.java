package com.sem2.sem2_project.dto.request;

import lombok.Data;

@Data
public class UserRequest {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
}
