package org.example.Bank;

import com.google.inject.Singleton;

@Singleton
public class InterestingCounting {

    public double percentCounting(double balance)
    {
        if (balance < 500000)
        {
            return 0.04;
        }
        return 0.01;
    }

    public double counting(double balance) {
        balance = balance + balance * this.percentCounting(balance);
        return balance;
    }
}
