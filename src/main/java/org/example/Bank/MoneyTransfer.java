package org.example.Bank;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.Card.BankCard;
import org.example.Bank.Investments.InvestmentAccount;
import org.example.Bank.Investments.Stock;
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

    public void addMoney(BankAccount bankAccount, double amount)
    {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
    }

    public void interestingAddMoney(BankAccount bankAccount, double amount)
    {
        System.out.println("Old balance=" + bankAccount.getBalance());
        this.addMoney(bankAccount, amount);
        System.out.println("New balance=" + bankAccount.getBalance());
    }

    public void investmentAddMoney(InvestmentAccount investmentAccount, double amount)
    {
        for (Map.Entry<String, Stock> entrySet : investmentAccount.getMap().entrySet()) {
             Stock stock = entrySet.getValue();
             stock.setBalance(amount* stock.getPercentage());
             investmentAccount.getMap().put(entrySet.getKey(), stock);
             System.out.println(stock.getId() + ": " + stock.getBalance());
        }
    }
}