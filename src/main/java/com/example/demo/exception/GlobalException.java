package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationException( ValidationException ex){
        return new ResponseEntity<string>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

    }
}