package com.fooddelivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<GlobalCustomException> handleGlobalException(Exception exception, WebRequest request){
        return new ResponseEntity(new GlobalCustomException(new Date(),exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
