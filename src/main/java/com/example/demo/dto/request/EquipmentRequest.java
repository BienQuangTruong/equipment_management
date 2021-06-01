package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentRequest {
    @NotNull(message = "Equipment mustn't be empty or null")
    private String equipment;
}
