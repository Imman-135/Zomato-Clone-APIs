package com.example.zomato.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorStructure<T> {
    private int statusCode;
    private String message;
    private T rootCause;

    public static <T> ErrorStructure<T> create(HttpStatus status, String message, T rootCause) {
        return ErrorStructure.build(status, message, rootCause);
    }
    public  static <T> ErrorStructure<T> build(HttpStatus status, String message, T rootCause){
        ErrorStructure<T> structure=new ErrorStructure<>();
        structure.setMessage(message);
        structure.setStatusCode(status.value());
        structure.setRootCause(rootCause);
        return structure;
    }
}
