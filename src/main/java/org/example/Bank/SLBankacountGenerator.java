package org.example.Bank;

import com.google.inject.Singleton;

@Singleton
public class SLBankacountGenerator implements AccountNumberGenerator {
    @Override
    public String generateBankAccountNumber() {
        return "Bankacount SL";
    }
}
