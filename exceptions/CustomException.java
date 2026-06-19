package jala.exceptions;

/**
 * Assignment-14: Exceptions
 * Task 6: Custom Exception class
 * Author: Anil Jagari
 */
public class CustomException extends Exception {

    // =====================================================
    // Custom Exception with custom message
    // Extends Exception → checked exception
    // =====================================================
    String errorCode;
    String errorMessage;

    // No-arg constructor
    public CustomException() {
        super("Custom Exception occurred!");
        this.errorCode    = "ERR-001";
        this.errorMessage = "Custom Exception occurred!";
    }

    // Constructor with message
    public CustomException(String message) {
        super(message);
        this.errorCode    = "ERR-002";
        this.errorMessage = message;
    }

    // Constructor with code and message
    public CustomException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode    = errorCode;
        this.errorMessage = errorMessage;
    }

    // Show error details
    public void showErrorDetails() {
        System.out.println("  Error Code    : " + errorCode);
        System.out.println("  Error Message : " + errorMessage);
    }
}