package org.example.Bank;

import com.google.inject.Singleton;

@Singleton
public class InterestingCounting {

    public double percentCounting(BankAccount account)
    {
        if (account.getBalance() < 500000)
        {
            return 0.04;
        }
        return 0.01;
    }

    public double counting(double balance, double interest) {
        balance = balance + balance * interest;
        return balance;
    }
}
