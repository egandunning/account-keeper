package com.egandunning.exception;

public class InvalidCentAmountException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message = "Invalid cent amount. ";
    
    public InvalidCentAmountException() {}
    
    public InvalidCentAmountException(int amount) {
        message += amount + " must be greater than or equal to 0 and less than 99.";
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
