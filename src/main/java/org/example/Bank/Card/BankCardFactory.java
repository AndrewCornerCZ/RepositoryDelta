package org.example.Bank.Card;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class BankCardFactory {
    @Inject
    public CardNumberGenerator cardNumberGenerator;

    @Inject
    public  CardPinGenerator cardPinGenerator;

    public BankCard BankCardFactory() {
        return new BankCard(
                this.cardNumberGenerator.generateCardNumber(),
                this.cardPinGenerator.generateCardPinNumber()
        );
    }
}
