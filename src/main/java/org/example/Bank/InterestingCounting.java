package org.example.Bank;

public class InterestingCounting {

    public int Counting(SavingAccount account)
    {
        if (account.getBalance() < 500000)
        {
            return 4;
        }
        return 1;
    }
}
