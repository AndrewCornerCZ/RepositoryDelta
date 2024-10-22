package org.example.Bank;

import org.example.Bank.Card.BankCard;
import org.example.person.Owner;

import javax.smartcardio.Card;
import java.util.*;

public class BankAccount {
    private double balance;
    private Owner owner;
    private String accountNumber;
    private Map<String, BankCard> cards = new HashMap<>();

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

    public void AddCard(BankCard card) {
        cards.put(card.getNumber(), card);
    }
    public Map<String, BankCard> GetCards() {
        return cards;
    }
    public BankCard GetCard(String name) {
        BankCard bankCard = null;
        return cards.get(name);
    }
}
