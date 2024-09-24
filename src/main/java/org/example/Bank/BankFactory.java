package org.example.Bank;

import person.Owner;

public class BankFactory implements AcountNumberGenerator {

    private AcountNumberGenerator bankacountNumberGenerator;

    public BankFactory(AcountNumberGenerator bankacountNumberGenerator) {
        this.bankacountNumberGenerator = bankacountNumberGenerator;
    }

    public Bankacount createBankacount(double balance, Owner owner) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new Bankacount(balance, owner, bankAccountNumber);
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

    @Override
    public String generateBankAccountNumber() {
        return "";
    }
}
