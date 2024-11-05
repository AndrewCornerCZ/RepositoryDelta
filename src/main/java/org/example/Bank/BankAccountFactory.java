package org.example.Bank;

import org.example.Bank.Investments.InvestmentAccount;
import org.example.Bank.Investments.Stock;
import org.example.person.Owner;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.Map;

@Singleton
public class BankAccountFactory {
    @Inject
    private AccountNumberGenerator bankacountNumberGenerator;


    public BankAccount createBankacount(double balance, Owner owner) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new BankAccount(balance, owner, bankAccountNumber);
    }
    public StudentBankAccount createStudentBankacount(double balance, Owner owner, String number) {
        return new StudentBankAccount(balance, owner, number);
    }
    public StudentBankAccount createStudentBankacount(double balance, Owner owner) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new StudentBankAccount(balance, owner, bankAccountNumber);
    }
    public SavingAccount createSavingBankacount(double balance, Owner owner) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new SavingAccount(balance, owner, bankAccountNumber);
    }
    public SavingAccount createSavingBankacount(double balance, Owner owner, String number) {
        return new SavingAccount(balance, owner, number);
    }
    public InvestmentAccount createInvestmentAccount(double balance, Owner owner, Map<String, Stock> stocks) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new InvestmentAccount(balance, owner, bankAccountNumber, stocks);
    }
}
