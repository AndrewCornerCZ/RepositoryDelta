package org.example;

import org.example.Bank.*;
import person.Owner;
import person.OwnerFactory;

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
        Owner majitel = new Owner("Pepa", "Nový", "1");
        OwnerFactory owner = new OwnerFactory();
        owner.createOwner("Spytihněv", "Novák", "3");
        BankFactory bankFactory = new BankFactory();

        Bankacount OriginalBankaccount = bankFactory.createBankacount(200.0, majitel, "1");
        Bankacount StudentBankaccount = bankFactory.createStudentBankacount(200.0, majitel, "1");

        Bankacount bank = new Bankacount(1000000.0, majitel, "123456789");
        Owner majitel2 = new Owner("Franta", "Novotný", "2");
        Bankacount bank2 = new Bankacount(0.0, majitel2, "123456781");
        MoneyTransfer transfer = new MoneyTransfer();
        transfer.Add(bank, 200);
        transfer.Add(bank, 800);
        Scanner sc = new Scanner(System.in);
        try {
            transfer.TransferMoneyBetweenAccounts(bank, bank2, sc.nextDouble());
        }
        catch (NoMoneyExpection e)
        {
            System.out.println(e.getMessage());
        }
    }
}
