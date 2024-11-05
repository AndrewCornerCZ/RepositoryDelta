package org.example.Bank.Investments;

import com.google.inject.Singleton;

import java.util.Map;

@Singleton
public class dividentCounting {
    public double counting(InvestmentAccount investmentAccount)
    {
        double amount = 0;
        for (Map.Entry<String, Stock> entrySet : investmentAccount.getMap().entrySet()) {
            Stock stock = entrySet.getValue();
            amount+= stock.getBalance() * stock.getDivident();
            System.out.println("Divident " + stock.getId() + ": " + stock.getBalance() * stock.getDivident());
        }
        System.out.println("Amount: " + amount);
        return amount;
    }
}
