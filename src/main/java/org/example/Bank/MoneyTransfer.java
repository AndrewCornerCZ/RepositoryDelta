package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.Card.BankCard;
import org.example.Bank.exception.NoMoneyOnAccountException;
import org.example.Bank.exception.WrongPinException;

import java.util.Map;

@Singleton
public class MoneyTransfer {

    @Inject
    private AccountDetailPrinter accountDetailPrinter;
    @Inject
    private SavingAccount.TransferFee transferFee;


    public void withdrawMoney(BankAccount bankAccount, double amount) throws NoMoneyOnAccountException
    {
        if(bankAccount.getBalance() < amount) {
            throw new NoMoneyOnAccountException("No money");
        }
        System.out.println("Balance before: " + bankAccount.getBalance());
        bankAccount.setBalance(bankAccount.getBalance()-amount);
        System.out.println("Balance after: " + bankAccount.getBalance());
    }

    public void printDetail(BankAccount bankacount)
    {
        System.out.println("Balance: " + bankacount.getBalance());
    }

    public void TransferMoneyBetweenAccounts(BankAccount sender, BankAccount receiver, double amount ) throws NoMoneyExpection
    {
        if(sender.getBalance() < amount)
        {
            throw new NoMoneyExpection("Nedostatek financí");
        }
        this.accountDetailPrinter.printDetail(sender);
        sender.setBalance(sender.getBalance() - amount);
        System.out.println("Balance: " + sender.getBalance());
        receiver.setBalance(receiver.getBalance() + amount);
        System.out.println("Balance: " + receiver.getBalance());
    }
    public boolean PinConfirmation(String pin, String number, BankCard bankCard) throws WrongPinException
    {
        if(pin != bankCard.getPin())
        {
            return false;
        }
        return true;
    }
}