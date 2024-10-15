package org.example.Bank.Card;


import org.example.Bank.BankAccount;

public class BankCard {
    private String number;
    private String pin;
    private BankAccount bankAccount;

    public BankCard(String number, String pin, BankAccount bankAccount) {
        this.number = number;
        this.pin = pin;
        bankAccount = bankAccount;
    }

    public String getNumber() {
        return number;
    }
}
