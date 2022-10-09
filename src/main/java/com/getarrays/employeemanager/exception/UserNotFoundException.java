package com.getarrays.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {

        // it's going to call constructor RunTimeException and pass this message
        super(message);
    }
}
