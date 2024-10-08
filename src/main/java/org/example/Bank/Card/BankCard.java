package org.example.Bank.Card;


import person.Owner;

import java.util.HashMap;
import java.util.Map;

public class BankCard {
    private String number;
    private String pin;

    public BankCard(String number, String pin) {
        BankCardFactory bankCardFactory = new BankCardFactory();
    }

    public String getNumber() {
        return number;
    }
}
