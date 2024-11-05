package org.example.Bank.Investments;

import com.google.inject.Inject;
import org.example.Bank.*;

public class InvestmentService {
    @Inject
    MoneyTransfer moneyTransfer;
    @Inject
    dividentCounting dividentCounting;

    public void run(InvestmentAccount investmentAccount) {
        System.out.println("start interesting process");
        moneyTransfer.investmentAddMoney(investmentAccount, dividentCounting.counting(investmentAccount));

    }

}