package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.Card.BankCard;
import org.example.Bank.exception.NoMoneyOnAccountException;
import org.example.Bank.exception.WrongPinException;

@Singleton
public class AtmService {
    @Inject
    MoneyTransfer moneyTransfer;
    @Inject
    GlobalBankCardStorage bankCardStorage;
    public void withdrawMoney(String number, String pin, double amount) throws NoMoneyOnAccountException, WrongPinException {
        BankAccount bankAccount = bankCardStorage.getBankCard(number);
        if (moneyTransfer.PinConfirmation(pin,number, bankAccount.GetCard(number) )==false)
        {
            throw new WrongPinException("Špatný pin");
        }
        moneyTransfer.withdrawMoney(bankAccount, amount);
    }
    public void depositMoney(String number, String pin, double amount) throws WrongPinException {

        BankAccount bankAccount = bankCardStorage.getBankCard(number);
        if (moneyTransfer.PinConfirmation(pin, number, bankAccount.GetCard(number))==false)
        {
            throw new WrongPinException("Špatný pin");
        }
        System.out.println("Balance before: " + bankAccount.getBalance());
        bankAccount.setBalance(bankAccount.getBalance()+amount);
        System.out.println("Balance after: " + bankAccount.getBalance());
    }
}
