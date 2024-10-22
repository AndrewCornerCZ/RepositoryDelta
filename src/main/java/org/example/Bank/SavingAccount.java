package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.person.Owner;
@Singleton
public class SavingAccount extends BankAccount implements Interesting{
    @Inject
    public SavingAccount(Double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber);
    }


    @Override
    public double getInterest() {
        InterestingCounting count = new InterestingCounting();
        return count.percentCounting(1);
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
