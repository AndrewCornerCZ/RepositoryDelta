package org.example;

import org.example.Bank.*;
import person.Owner;
import person.OwnerFactory;
import person.PersonalIdValidator;
import print.Calc;
import print.Calcul;

import java.util.Scanner;

public class App {
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
        Calc kalk = new Calcul();
        System.out.println(kalk.add(a, b));
        System.out.println(kalk.div(a, b));
        System.out.println(kalk.sub(a, b));
        System.out.println(kalk.mul(a, b));

    }
    public void runbank()
    {
        DIContainer serviceContainer = new DIContainer();

        Bankacount OriginalBankaccount = serviceContainer.bankFactory.createBankacount(200.0, serviceContainer.majitel);
        Bankacount StudentBankaccount = serviceContainer.bankFactory.createStudentBankacount(200.0, serviceContainer.majitel);
        Bankacount SavingBankaccount = serviceContainer.bankFactory.createSavingBankacount(200.0, serviceContainer.majitel);
        if (StudentBankaccount instanceof StudentBankacount)
        {
            String expire = ((StudentBankacount) StudentBankaccount).getStudies();
            System.out.println(expire);
        }

        if (SavingBankaccount instanceof Interesting)
        {
            double interest = ((Interesting) SavingBankaccount).getInterest();
            System.out.println(interest);
        }



        Bankacount bank = new Bankacount(1000000.0, serviceContainer.majitel, "123456789");
        Owner majitel2 = new Owner("Franta", "Novotný", "2");
        Bankacount bank2 = new Bankacount(0.0, majitel2, "123456781");
        serviceContainer.moneyTransfer.Add(bank, 200);
        serviceContainer.moneyTransfer.Add(bank2, 800);
        Scanner sc = new Scanner(System.in);
        try {
            serviceContainer.moneyTransfer.TransferMoneyBetweenAccounts(bank, bank2, sc.nextDouble());
        }
        catch (NoMoneyExpection e)
        {
            System.out.println(e.getMessage());
        }
    }
}
