package org.example;

import com.google.inject.Inject;
import org.example.Bank.*;
import org.example.Bank.Card.BankCard;
import org.example.Bank.Investments.InvestmentAccount;
import org.example.Bank.Investments.InvestmentService;
import org.example.Bank.Investments.Stock;
import org.example.Bank.Investments.StockFactory;
import org.example.Bank.exception.NoMoneyOnAccountException;
import org.example.Bank.exception.WrongPinException;
import org.example.person.Owner;
import org.example.person.OwnerFactory;
import org.example.person.PersonSerialiazationService;
import org.example.print.Calc;
import org.example.print.Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    @Inject
    PersonSerialiazationService personSerialiazationService;
    @Inject
    OwnerFactory ownerFactory;
    @Inject
    AtmService atmService;
    @Inject
    AccountFacade accountFacade;
    @Inject
    InterestingSevice interestingSevice;
    @Inject
    StockFactory stockFactory;
    @Inject
    MoneyTransfer moneyTransfer;
    @Inject
    InvestmentService investmentService;

    public void runbank() throws NoMoneyOnAccountException, WrongPinException {
        Owner owner1 = this.ownerFactory.createOwner("Ondra", "Kout", "23");
        BankAccount originalBankAccount = this.accountFacade.createBankAccount(100, owner1, true);
        BankAccount studentBankAccount = this.accountFacade.createStudentBankAccount(100, owner1, true);
        BankAccount savingBankAccount = this.accountFacade.createSavingBankAccount(100, owner1, true);
        BankCard bankCard = null;
        for (Map.Entry<String, BankCard> entrySet : originalBankAccount.GetCards().entrySet()) {
            bankCard = entrySet.getValue();
        }
        System.out.println(personSerialiazationService.serializeOwner(owner1));
        atmService.depositMoney(bankCard.getNumber(), bankCard.getPin(), 100);
        atmService.withdrawMoney(bankCard.getNumber(), bankCard.getPin(), 100);
        interestingSevice.run();

        Map<String, Stock> stocksMap = new HashMap<>();
        Stock apple = this.stockFactory.createStock("apple",0, 0.35, 0.01);
        Stock microsoft = this.stockFactory.createStock("microsoft",0, 0.5, 0.02);
        Stock tesla = this.stockFactory.createStock("tesla",0, 0.15, 0.03);
        stocksMap.put("apple", apple);
        stocksMap.put("microsoft", microsoft);
        stocksMap.put("tesla", tesla);
        InvestmentAccount investmentAccount = this.accountFacade.createInvestmentAccount(0, owner1, false, stocksMap);
        moneyTransfer.investmentAddMoney(investmentAccount,1000);
        moneyTransfer.investmentAddMoney(investmentAccount,720);
        moneyTransfer.investmentAddMoney(investmentAccount,914);
        investmentService.run(investmentAccount);
    }



    public void Run() {
        int v = 100;
        int x = 50;
        System.out.println(v + x);

        String retez = "toto je řetězec a tady je a";
        System.out.println(retez.length());
        char findchar = 'a';
        int countera = 0;
        for (int i = 0; i < retez.length(); i++)
        {
            if (retez.charAt(i) == findchar)
            {
                countera++;
            }
        }
        System.out.println(countera);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Calc kalk = new Calculator();
        System.out.println(kalk.add(a, b));
        System.out.println(kalk.div(a, b));
        System.out.println(kalk.sub(a, b));
        System.out.println(kalk.mul(a, b));
    }
}
