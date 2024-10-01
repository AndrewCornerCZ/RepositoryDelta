package org.example.Bank;

import person.Owner;

public class Savingacount extends BankAccount implements Interesting{
    public Savingacount(Double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber);
    }


    @Override
    public double getInterest() {
        InterestingCounting count = new InterestingCounting();
        return count.Counting(this);
    }

    public static class TransferFee {
        public static final double DEFAULT_TRANSFER_FEE = 10;
        public static final double DEFAULT_LIMIT = 500;

        public double FeeCalcul(double amount)
        {

            double fee = DEFAULT_TRANSFER_FEE;
            if (amount >= DEFAULT_LIMIT)
            {
                fee += amount/100;
            }
            return fee;
        }
    }
}
