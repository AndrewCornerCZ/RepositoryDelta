package org.example.Bank.Card;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.BankAccount;

@Singleton
public class BankCardFactory {
    @Inject
    CardNumberGenerator bankCardNumberGenerator;
    @Inject
    CardPinGenerator bankCardPINGenerator;

    public BankCard createBankCard(BankAccount bankAccount) {
        return new BankCard(bankCardNumberGenerator.generateCardNumber(), bankCardPINGenerator.generateCardPinNumber(), bankAccount);
    }
}

