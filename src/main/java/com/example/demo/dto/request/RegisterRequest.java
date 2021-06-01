package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotEmpty(message = "User name must not be empty")
    private String userName;
    @NotEmpty(message = "Password must not be empty")
    private String password;
    @NotEmpty(message = "Roles must not be empty")
    private String roles;
}
