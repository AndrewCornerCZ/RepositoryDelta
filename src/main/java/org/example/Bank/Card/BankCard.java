package org.example.Bank.Card;


import org.example.Bank.BankAccount;

public class BankCard {
    private String number;
    private String pin;
    private transient BankAccount bankAccount;

    public BankCard(String number, String pin, BankAccount bankAccount) {
        this.number = number;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

    public String getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }
}
