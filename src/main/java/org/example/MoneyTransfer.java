package org.example;

public class MoneyTransfer {

    public void Add (Bankacount bankacount, double add)
    {
        TransferFee pop = new TransferFee();
        double balance = bankacount.getBalance();
        double fee = pop.FeeCalcul(add);
        double NewBalance = balance + add - fee;

        bankacount.setBalance(NewBalance);
        this.printDetail(bankacount);
    }

    public void printDetail(Bankacount bankacount)
    {
        System.out.println("Balance: " + bankacount.getBalance());
    }
}
