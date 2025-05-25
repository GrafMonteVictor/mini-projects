package com.example.spring_postgre_app.model;

import lombok.Getter;

@Getter
public class ErrorInfo {
    private String message;

    public ErrorInfo(String message) {
        this.message = message;
    }
}
