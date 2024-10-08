package org.example.Bank;

import org.example.Bank.Card.BankCard;
import person.Owner;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class BankFactory {
    @Inject
    private AccountNumberGenerator bankacountNumberGenerator;


    public BankAccount createBankacount(double balance, Owner owner) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new BankAccount(balance, owner, bankAccountNumber);
    }
    public StudentBankacount createStudentBankacount(double balance, Owner owner, String number) {
        return new StudentBankacount(balance, owner, number);
    }
    public StudentBankacount createStudentBankacount(double balance, Owner owner) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new StudentBankacount(balance, owner, bankAccountNumber);
    }
    public Savingacount createSavingBankacount(double balance, Owner owner) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new Savingacount(balance, owner, bankAccountNumber);
    }
    public Savingacount createSavingBankacount(double balance, Owner owner, String number) {
        return new Savingacount(balance, owner, number);
    }

}
