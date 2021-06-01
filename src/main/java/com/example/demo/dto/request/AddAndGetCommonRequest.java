package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAndGetCommonRequest {
    @NotNull(message = "List equipment must be not null or empty")
    private List<String> equipments;
}
