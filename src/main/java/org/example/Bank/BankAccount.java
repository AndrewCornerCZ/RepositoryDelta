package org.example.Bank;

import person.Owner;

public class BankAccount {
    private double balance;
    private Owner owner;
    private String accountNumber;

    public BankAccount(Double balance, Owner owner, String accountNumber) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
