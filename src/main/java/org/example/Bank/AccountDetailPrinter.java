package org.example.Bank;

import com.google.inject.Singleton;

@Singleton
public class AccountDetailPrinter {

    public void printDetail(BankAccount accout)
    {
        System.out.println("Account Number: " + accout.getAccountNumber());
    }
}
