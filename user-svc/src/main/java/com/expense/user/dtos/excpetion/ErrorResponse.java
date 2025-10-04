package com.expense.user.dtos.excpetion;

import org.springframework.http.HttpStatusCode;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {

    private HttpStatusCode statusCode;

    private String errorMessage;

    private String description;

}
