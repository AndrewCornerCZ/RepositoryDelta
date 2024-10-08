package org.example.Bank;


import com.google.inject.Singleton;

import java.util.Random;
@Singleton
public class BankAccountNumberGenerator implements AccountNumberGenerator {
    public String generateBankAccountNumber() {
        Random rand = new Random();
        int random;
        String Id = "";
        for (int i = 0; i < 10; i++)
        {
            random = rand.nextInt(9);
            Id += random;
        }

        return Id;
    }


}
