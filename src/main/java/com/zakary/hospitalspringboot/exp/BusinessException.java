package com.zakary.hospitalspringboot.exp;

public class BusinessException extends RuntimeException {
    public  BusinessException(String message){
        super(message);
    }
}
