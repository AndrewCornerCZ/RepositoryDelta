package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.Card.BankCard;
import org.example.Bank.exception.NoMoneyOnAccountException;
@Singleton
public class AtmService {

    @Inject
    GlobalBankCardStorage bankCardStorage;
    public void withdrawMoney(String number, double amount) throws NoMoneyOnAccountException {
        BankAccount bankAccount = bankCardStorage.getBankCard(number);
        if(bankAccount.getBalance() < amount){
            throw new NoMoneyOnAccountException("No money");
        }
        System.out.println("Balance before: " + bankAccount.getBalance());
        bankAccount.setBalance(bankAccount.getBalance()-amount);
        System.out.println("Balance after: " + bankAccount.getBalance());
    }
    public void depositMoney(String number, double amount){
        BankAccount bankAccount = bankCardStorage.getBankCard(number);
        System.out.println("Balance before: " + bankAccount.getBalance());
        bankAccount.setBalance(bankAccount.getBalance()+amount);
        System.out.println("Balance after: " + bankAccount.getBalance());
    }
}
