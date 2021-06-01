package com.example.demo.exception;

import java.util.Date;

public class ErrorMessage {
    private Integer statusCode;
    private String message;
    private Date timestamp;
    private String description;

    public ErrorMessage(int value, String message, Date date, String description) {
    }
}
