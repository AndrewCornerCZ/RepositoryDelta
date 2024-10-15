package org.example.Bank.Card;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class BankCardFactory {
    @Inject
    CardNumberGenerator bankCardNumberGenerator;
    @Inject
    CardPinGenerator bankCardPINGenerator;

    public BankCard createBankCard(){
        return new BankCard(bankCardNumberGenerator.generateCardNumber(), bankCardPINGenerator.generateCardPinNumber());
    }
}

