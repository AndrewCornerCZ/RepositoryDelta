package org.example;

import com.google.inject.Inject;
import org.example.Bank.*;
import person.*;
import com.google.inject.Singleton;
@Singleton
public class DIContainer {
    AccountNumberGenerator bankAccountNumberGenerator = new BankAccountNumberGenerator();
    Savingacount.TransferFee transferFee = new Savingacount.TransferFee();
    PersonalIdValidator personvalidator = new PersonalIdValidator();
    OwnerFactory ownerFactory = new OwnerFactory(bankAccountNumberGenerator, personvalidator);
    AccountDetailPrinter accountDetailPrinter = new AccountDetailPrinter();
    MoneyTransfer moneyTransfer = new MoneyTransfer(accountDetailPrinter, transferFee);
    PersonSerialiazationService ownerJsonSerializationService = new OwnerGsonSerializationService();

    @Inject
    public BankFactory bankFactory;
    public AccountNumberGenerator getBankAccountNumberGenerator() {
        return bankAccountNumberGenerator;
    }

    public Savingacount.TransferFee getTransferFee() {
        return transferFee;
    }

    public PersonalIdValidator getPersonvalidator() {
        return personvalidator;
    }

    public OwnerFactory getOwner() {
        return ownerFactory;
    }

    public AccountDetailPrinter getAccountDetailPrinter() {
        return accountDetailPrinter;
    }

    public MoneyTransfer getMoneyTransfer() {
        return moneyTransfer;
    }

    public BankFactory getBankFactory() {
        return bankFactory;
    }

    public PersonSerialiazationService getOwnerJsonSerializationService() {
        return ownerJsonSerializationService;
    }

    public OwnerFactory getOwnerFactory() {
        return ownerFactory;
    }
}
