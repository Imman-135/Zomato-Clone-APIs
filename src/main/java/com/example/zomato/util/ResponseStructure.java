package com.example.zomato.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter

public class ResponseStructure<T> {

    private String message;
    private int statusCode;
    private T body;
    public static <T> ResponseStructure<T> create(HttpStatus status, String message, T body) {
        return ResponseStructure.build(status, message, body);
    }
    public static <T> ResponseStructure<T> build(HttpStatus status, String message, T body){
        ResponseStructure<T> structure=new ResponseStructure<>();
        structure.setMessage(message);
        structure.setStatusCode(status.value());
        structure.setBody(body);
        return structure;
    }
}
