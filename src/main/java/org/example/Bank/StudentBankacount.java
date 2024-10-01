package org.example.Bank;

import person.Owner;

public class StudentBankacount extends BankAccount {

    private String studiesConfirmation;

    public StudentBankacount(Double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber);

        this.studiesConfirmation = null;
    }

    public StudentBankacount(Double balance, Owner owner, String accountNumber, String StudiesConfirmation) {
        super(balance, owner, accountNumber);

        this.studiesConfirmation = StudiesConfirmation;
    }

    public String getStudies() {
        return studiesConfirmation;
    }
}
