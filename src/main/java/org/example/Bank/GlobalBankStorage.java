package org.example.Bank;

import com.google.inject.Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Singleton
public class GlobalBankStorage {
    public List< BankAccount> storage;

    public GlobalBankStorage() {
        storage = new ArrayList< BankAccount >();

    }


    public void addBankAccount( BankAccount bankAccount) {
        storage.add(bankAccount);
    }

    public List< BankAccount> getStorage() {
        return storage;
    }
}
