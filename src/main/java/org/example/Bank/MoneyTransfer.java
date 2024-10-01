package org.example.Bank;

public class MoneyTransfer {


    private AccountDetailPrinter accountDetailPrinter;
    private Savingacount.TransferFee transferFee;

    public MoneyTransfer(AccountDetailPrinter accountDetailPrinter, Savingacount.TransferFee transferFee) {
        this.accountDetailPrinter = accountDetailPrinter;
        this.transferFee = transferFee;
    }

    public void Add (BankAccount bankacount, double add)
    {
        double balance = bankacount.getBalance();
        double fee = this.transferFee.FeeCalcul(add);
        double NewBalance = balance + add - fee;

        bankacount.setBalance(NewBalance);
        this.printDetail(bankacount);
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
}