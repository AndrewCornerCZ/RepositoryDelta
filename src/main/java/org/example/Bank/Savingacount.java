package org.example.Bank;

import person.Owner;

public class Savingacount extends Bankacount implements Interesting{
    public Savingacount(Double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber);
    }


    @Override
    public double getInterest() {
        InterestingCounting count = new InterestingCounting();
        return count.Counting(this);
    }
}
