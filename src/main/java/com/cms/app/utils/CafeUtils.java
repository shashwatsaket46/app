package com.cms.app.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    private CafeUtils() {

    }
    @SuppressWarnings("null")
    public static ResponseEntity<String> getResponseEntity(String responseMessgae, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\"" +responseMessgae+ "\"}",httpStatus);

    }
}
