package org.example.Bank.exception;

public class NoMoneyOnAccountException extends Exception{
    public NoMoneyOnAccountException(String message) {
        super(message);
    }
}
