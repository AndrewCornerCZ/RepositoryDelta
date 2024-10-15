package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.Card.BankCard;
import org.example.Bank.Card.BankCardFactory;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class GlobalBankCardStorage {
    public Map<String, BankAccount> storage;

    public GlobalBankCardStorage() {
        storage = new HashMap<>();
    }

    public BankAccount getBankCard(String cardNumber) {
        return storage.get(cardNumber);
    }

    public BankAccount addBankCard(String cardNumber, BankAccount bankAccount) {
        storage.put(cardNumber, bankAccount);
        return bankAccount;
    }
}
