package com.expense.user.controllers;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.expense.user.dtos.excpetion.ErrorResponse;

@ControllerAdvice
public class ServiceExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> notFoundException(NotFoundException e) {
        ErrorResponse error = ErrorResponse.builder()
                .statusCode(HttpStatus.NOT_FOUND)
                .errorMessage(e.getMessage())
                .description(e.getLocalizedMessage())
                .build();
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
