package org.example.Bank;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.Bank.Card.BankCard;
import org.example.Bank.Card.BankCardFactory;
import org.example.person.Owner;
import org.example.person.OwnerFactory;
import org.example.print.BankInjector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankCardFactoryTest {
    Injector i = Guice.createInjector(new BankInjector());

    private OwnerFactory ownerFactory;
    private BankAccountFactory bankAccountFactory;
    private BankCardFactory bankCardFactory;

    @BeforeEach
    public void setUp() {
        ownerFactory = i.getInstance(OwnerFactory.class);
        bankAccountFactory = i.getInstance(BankAccountFactory.class);
        bankCardFactory = i.getInstance(BankCardFactory.class);
    }

    @Test
    public void createBankCard() {
        Owner owner = ownerFactory.createOwner("Ondra", "Kout", "69");

        assertEquals(owner.getName(), "Ondra");
        assertEquals(owner.getSurname(), "Kout");
        assertEquals(owner.getPersonalId(), "69");

        BankAccount bankAccount = bankAccountFactory.createBankacount(1000, owner);

        assertEquals(bankAccount.getBalance(), 1000);
        assertEquals(bankAccount.getOwner(), owner);

        BankCard card = bankCardFactory.createBankCard(bankAccount);
        assertEquals(4, card.getPin().length());

    }

}
