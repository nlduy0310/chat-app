package com.nlduy0310.chat_app_backend.handler;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nlduy0310.chat_app_backend.exception.DuplicateEmailException;
import com.nlduy0310.chat_app_backend.exception.RequestValidationException;

@ControllerAdvice
public class GlobalExceptionHandler {
    // TODO document all errors

    @ExceptionHandler(RequestValidationException.class)
    public ResponseEntity<?> handleRequestValidationError(RequestValidationException exception) {
        Map<String, String> formattedErrors = exception.getFieldErrors().stream()
                .collect(Collectors.toMap(
                        fieldError -> fieldError.getField(),
                        fieldError -> fieldError.getDefaultMessage(),
                        (existingValue, newValue) -> existingValue + "; " + newValue));
        return ResponseEntity.badRequest().body(formattedErrors);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        Map<String, String> formatterErrors = exception.getFieldErrors().stream()
                .collect(Collectors.toMap(
                        fieldError -> fieldError.getField(),
                        fieldError -> fieldError.getDefaultMessage(),
                        (existingValue, newValue) -> existingValue + "; " + newValue));

        return ResponseEntity.badRequest().body(formatterErrors);
    }

    @ExceptionHandler(DuplicateEmailException.class)
    public ResponseEntity<?> handleDuplicateEmailException(DuplicateEmailException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }
}
