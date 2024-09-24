package org.example;

import org.example.Bank.*;
import person.Owner;
import person.OwnerFactory;
import person.PersonalIdValidator;

public class DIContainer {
    AcountNumberGenerator bankAccountNumberGenerator = new BankacountNumberGenerator();
    Savingacount.TransferFee transferFee = new Savingacount.TransferFee();
    PersonalIdValidator personvalidator = new PersonalIdValidator();
    OwnerFactory owner = new OwnerFactory(bankAccountNumberGenerator, personvalidator);
    AccountDetailPrinter accountDetailPrinter = new AccountDetailPrinter();
    SLBankacountGenerator.MoneyTransfer moneyTransfer = new SLBankacountGenerator.MoneyTransfer(accountDetailPrinter, transferFee);
    Owner majitel = owner.createOwner("Spytihněv", "Novák", "3");
    BankFactory bankFactory = new BankFactory(bankAccountNumberGenerator);

    public AcountNumberGenerator getBankAccountNumberGenerator() {
        return bankAccountNumberGenerator;
    }

    public Savingacount.TransferFee getTransferFee() {
        return transferFee;
    }

    public PersonalIdValidator getPersonvalidator() {
        return personvalidator;
    }

    public OwnerFactory getOwner() {
        return owner;
    }

    public AccountDetailPrinter getAccountDetailPrinter() {
        return accountDetailPrinter;
    }

    public SLBankacountGenerator.MoneyTransfer getMoneyTransfer() {
        return moneyTransfer;
    }

    public Owner getMajitel() {
        return majitel;
    }

    public BankFactory getBankFactory() {
        return bankFactory;
    }
}
