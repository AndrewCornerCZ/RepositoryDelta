package org.example.Bank;

import person.Owner;

public class BankFactory {

    private BankacountNumberGenerator bankacountNumberGenerator;

    public BankacountNumberGenerator getBankacountNumberGenerator() {
        return bankacountNumberGenerator;
    }

    public Bankacount createBankacount(double balance, Owner ownerr, String number) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new Bankacount(balance, ownerr, bankAccountNumber);
    }
    public StudentBankacount createStudentBankacount(double balance, Owner ownerr, String number) {
        String bankAccountNumber = this.bankacountNumberGenerator.generateBankAccountNumber();
        return new StudentBankacount(balance, ownerr, bankAccountNumber);
    }
}
