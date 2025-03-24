package com.nlduy0310.chat_app_backend.exception;

import java.util.List;

import org.springframework.validation.FieldError;

public class RequestValidationException extends RuntimeException {
    private List<FieldError> fieldErrors;

    public RequestValidationException(List<FieldError> _fieldErrors) {
        this.fieldErrors = _fieldErrors;
    }

    public List<FieldError> getFieldErrors() {
        return this.fieldErrors;
    }
}
