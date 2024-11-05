package org.example.Bank.Investments;

public class StockFactory {
    public Stock createStock(String id, double balance, double percentage, double divident) {
        return new Stock(id, balance, percentage, divident);
    }
}
