package org.example.Bank;

public class InterestingCounting {

    public int Counting(Savingacount account)
    {
        if (account.getBalance() < 500000)
        {
            return 4;
        }
        return 1;
    }
}
