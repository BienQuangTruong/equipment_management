package com.example.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEquipmentAndCommonResponse {
    private String success;
    private List<String> equipments;
    private Integer count;
}
