package com.course.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Resource not found.";
        StandardError er = new StandardError(Instant.now(),HttpStatus.NOT_FOUND.value(), error,e.getMessage(),request.getRequestURI());
        return new ResponseEntity<>(er,HttpStatus.NOT_FOUND);
    }
}
