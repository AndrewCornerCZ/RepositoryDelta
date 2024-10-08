package org.example.Bank.Card;

import java.util.Random;

public class CardPinGenerator {
    public String generateCardPinNumber() {
        Random rand = new Random();
        int random;
        String Id = "";
        for (int i = 0; i < 4; i++)
        {
            random = rand.nextInt(9);
            Id += random;
        }

        return Id;
    }
}
