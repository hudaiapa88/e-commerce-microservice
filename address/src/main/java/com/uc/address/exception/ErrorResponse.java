package com.uc.address.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
    private String field;
    private String ExceptionClass;
    private String message;
}
