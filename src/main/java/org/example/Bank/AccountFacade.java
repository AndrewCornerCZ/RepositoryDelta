package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.Card.BankCard;
import org.example.Bank.Card.BankCardFactory;
import org.example.person.Owner;

@Singleton
public class AccountFacade {
    @Inject
    GlobalBankCardStorage globalBankCardStorage;
    @Inject
    BankCardFactory bankCardFactory;
    @Inject
    BankAccountFactory bankAccountFactory;

    public BankAccount createBankAccount(double balance, Owner owner1, boolean addcard) {
        BankAccount bankAccount1 = bankAccountFactory.createBankacount(100, owner1);
        if (addcard == true) {
            BankCard bankCard1 = bankCardFactory.createBankCard(bankAccount1);
            bankAccount1.AddCard(bankCard1);
            globalBankCardStorage.addBankCard(bankCard1.getNumber(), bankAccount1);
        }
        return bankAccount1;
    }


}
