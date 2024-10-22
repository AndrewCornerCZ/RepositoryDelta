package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.Card.BankCard;

@Singleton
public class InterestingSevice {
    @Inject
    GlobalBankStorage globalBankStorage;
    @Inject
    MoneyTransfer moneyTransfer;
    @Inject
    InterestingCounting interestingCounting;
    public void run()
    {
        System.out.println("start interesting process");

        for(BankAccount bankAccount: globalBankStorage.getStorage())
        {
            if (bankAccount instanceof Interesting)
            {
                System.out.println("Old balance=" + bankAccount.getBalance());
                bankAccount.setBalance(interestingCounting.counting(bankAccount.getBalance(), interestingCounting.percentCounting(bankAccount)));
                System.out.println("New balance=" + bankAccount.getBalance());
            }
        }
    }
}
