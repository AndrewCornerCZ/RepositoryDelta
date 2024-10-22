package org.example.Bank.exception;

public class WrongPinException extends Exception {
    public WrongPinException(String message) {
        super(message);
    }
}
