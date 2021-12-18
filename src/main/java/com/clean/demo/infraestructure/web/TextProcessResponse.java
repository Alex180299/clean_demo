package com.clean.demo.infraestructure.web;

import org.springframework.http.HttpStatus;

public class TextProcessResponse {
    private final HttpStatus status;
    private final String message;

    public TextProcessResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
