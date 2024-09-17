package org.example;

public class TransferFee {
    public static final double DEFAULT_TRANSFER_FEE = 10;
    public static final double DEFAULT_LIMIT = 500;

    public double FeeCalcul(double amount)
    {

        double fee = DEFAULT_TRANSFER_FEE;
        if (amount >= DEFAULT_LIMIT)
        {
            fee += amount/100;
        }
        return fee;
    }
}
