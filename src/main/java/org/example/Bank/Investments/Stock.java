package org.example.Bank.Investments;

public class Stock {
    private String id;
    private double balance;
    private double percentage;
    private double divident;
    public Stock(String id, double balance, double percentage, double divident) {
        this.id = id;
        this.balance = balance;
        this.percentage = percentage;
        this.divident = divident;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }
    public double getPercentage() {
        return percentage;
    }
    public double getDivident() {
        return divident;
    }
    public double getBalance() {
        return balance;
    }
    public String getId() {
        return id;
    }
}
