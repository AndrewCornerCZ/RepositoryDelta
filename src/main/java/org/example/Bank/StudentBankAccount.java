package org.example.Bank;

import org.example.person.Owner;

public class StudentBankAccount extends BankAccount {

    private String studiesConfirmation;

    public StudentBankAccount(Double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber);

        this.studiesConfirmation = null;
    }

    public StudentBankAccount(Double balance, Owner owner, String accountNumber, String StudiesConfirmation) {
        super(balance, owner, accountNumber);

        this.studiesConfirmation = StudiesConfirmation;
    }

    public String getStudies() {
        return studiesConfirmation;
    }
}
