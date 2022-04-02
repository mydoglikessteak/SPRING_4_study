package com.firstlesson.justtry.Handler;

import com.firstlesson.justtry.Model.Error.ErrorMessage;
import com.firstlesson.justtry.Model.Exception.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> HandleResourceNotFound(ResourceNotFoundException ex){  
            ErrorMessage error = new ErrorMessage("Not Found",404,ex.getMessage());

            return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
    
}
