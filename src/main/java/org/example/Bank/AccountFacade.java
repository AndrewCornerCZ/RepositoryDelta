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
    @Inject
    StudentBankAccount studentBankAccountBankAccount;
    @Inject
    SavingAccount savingAccount;

    public BankAccount createBankAccount(double balance, Owner owner1, boolean addcard) {
        BankAccount bankAccount1 = bankAccountFactory.createBankacount(balance, owner1);
        if (addcard == true) {
            BankCard bankCard1 = bankCardFactory.createBankCard(bankAccount1);
            bankAccount1.AddCard(bankCard1);
            globalBankCardStorage.addBankCard(bankCard1.getNumber(), bankAccount1);
        }
        return bankAccount1;
    }
    public StudentBankAccount createStudentBankAccount(double balance, Owner owner1, boolean addcard) {
        StudentBankAccount studentBankAccount1 = bankAccountFactory.createStudentBankacount(balance, owner1);
        if (addcard == true) {
            BankCard bankCard1 = bankCardFactory.createBankCard(studentBankAccount1);
            studentBankAccount1.AddCard(bankCard1);
            globalBankCardStorage.addBankCard(bankCard1.getNumber(), studentBankAccount1);
        }
        return studentBankAccount1;
    }
    public BankAccount createBankAccount1(double balance, Owner owner1, boolean addcard) {
        SavingAccount savingAccount1 = bankAccountFactory.createSavingBankacount(100, owner1);
        if (addcard == true) {
            BankCard bankCard1 = bankCardFactory.createBankCard(savingAccount1);
            savingAccount1.AddCard(bankCard1);
            globalBankCardStorage.addBankCard(bankCard1.getNumber(), savingAccount1);
        }
        return savingAccount1;
    }


}
