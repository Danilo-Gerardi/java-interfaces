package com.example.interfaces.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> resourceNotFoundException(Exception ex, WebRequest request) {

        List<String> s = Arrays.asList(ex.getMessage().split("default message"));
        String str = s.get(2).replaceAll("]", "");
        String msg = str.replaceAll("\\[", "");


        return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
    }
}