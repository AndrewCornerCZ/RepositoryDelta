package org.example.Bank.Investments;

import org.example.Bank.BankAccount;
import org.example.person.Owner;

import java.util.HashMap;
import java.util.Map;

public class InvestmentAccount extends BankAccount {

    private Map<String, Stock> stocks = new HashMap<>();
    public InvestmentAccount(Double balance, Owner owner, String accountNumber, Map<String, Stock> stocks) {
        super(balance, owner, accountNumber);
        this.stocks = stocks;
    }

    public Map<String, Stock> getMap()
    {
        return stocks;
    }

}
