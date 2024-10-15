package org.example.print;

import com.google.inject.AbstractModule;
import org.example.Bank.AccountNumberGenerator;
import org.example.Bank.SLBankAccountGenerator;
import org.example.person.OwnerJsonSerializationService;
import org.example.person.PersonSerialiazationService;

public class BankInjector extends AbstractModule{
    @Override
    protected void configure() {
        this.bind(AccountNumberGenerator.class).to(SLBankAccountGenerator.class);
        this.bind(PersonSerialiazationService.class).to(OwnerJsonSerializationService.class);
    }
}
