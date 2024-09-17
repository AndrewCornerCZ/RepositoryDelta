package org.example.Bank;

public class MoneyTransfer {

    public void Add (Bankacount bankacount, double add)
    {
        TransferFee poplatek = new TransferFee();
        double balance = bankacount.getBalance();
        double fee = poplatek.FeeCalcul(add);
        double NewBalance = balance + add - fee;

        bankacount.setBalance(NewBalance);
        this.printDetail(bankacount);
    }

    public void printDetail(Bankacount bankacount)
    {
        System.out.println("Balance: " + bankacount.getBalance());
    }

    public void TransferMoneyBetweenAccounts( Bankacount sender, Bankacount receiver, double amount ) throws NoMoneyExpection
    {
        if(sender.getBalance() < amount)
        {
            throw new NoMoneyExpection("Nedostatek financí");
        }

            sender.setBalance(sender.getBalance() - amount);
            System.out.println("Balance: " + sender.getBalance());
            receiver.setBalance(receiver.getBalance() + amount);
            System.out.println("Balance: " + receiver.getBalance());
    }
}
