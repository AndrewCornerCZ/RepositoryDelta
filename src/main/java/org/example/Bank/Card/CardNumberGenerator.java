package org.example.Bank.Card;

import java.util.Random;

public class CardNumberGenerator {
    public String generateCardNumber() {
        Random rand = new Random();
        int random;
        String Id = "";
        for (int i = 0; i < 16; i++)
        {
            random = rand.nextInt(9);
            Id += random;
        }

        return Id;
    }
}
