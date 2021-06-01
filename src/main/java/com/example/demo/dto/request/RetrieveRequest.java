package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveRequest {
    @NotEmpty(message = "Equipment mame must not be null or empty")
    private String equipmentName;
    @NotEmpty(message = "Equipment type must not be null or empty")
    private Long type;
    @NotEmpty(message = "User id must not be null or empty")
    private Long user;
}
