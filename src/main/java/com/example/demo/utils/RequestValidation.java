package com.example.demo.utils;

import com.example.demo.dto.request.AddAndGetCommonRequest;
import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.request.RetrieveRequest;

public class RequestValidation {

    public static String checkAddAndGetCommonRequest(AddAndGetCommonRequest request) {
        if (request == null || request.getEquipments() == null) {
            return "Invalid request";
        }
        return "";
    }

    public static String checkRetrieveRequest(RetrieveRequest request) {
        if (request == null || request.getType() == null || request.getUser() == null || request.getEquipmentName() == null) {
            return "Invalid request";
        }
        return "";
    }

    public static String checkRegisterRequest(RegisterRequest request) {
        if (request == null || request.getUserName() == null || request.getPassword() == null || request.getRoles() == null) {
            return "Invalid request";
        }
        return "";
    }

}