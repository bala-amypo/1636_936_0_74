package com.example.demo.exception;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidation( ValidationException ex){
        return new ResponseBody<string>(ex.getMessage);

    }
}