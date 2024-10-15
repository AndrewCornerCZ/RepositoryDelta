package org.example;

import com.google.inject.Inject;
import org.example.Bank.*;
import org.example.Bank.Card.BankCard;
import org.example.Bank.Card.BankCardFactory;
import person.Owner;
import person.OwnerFactory;
import person.OwnerJsonSerializationService;
import person.PersonSerialiazationService;
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
    @Inject
    PersonSerialiazationService personSerialiazationService;
    @Inject
    OwnerFactory ownerFactory;
    @Inject
    BankFactory bankFactory;
    @Inject
    BankCardFactory bankCardFactory;
    @Inject
    AtmService atmService;
    public void runbank()
    {
        BankCard card = this.bankCardFactory.createBankCard();
        Owner owner1 = this.ownerFactory.createOwner("Ondra", "Kout", "23");
        BankAccount OriginalBankaccount = this.bankFactory.createBankacount(200.0, owner1);
        BankAccount StudentBankaccount = this.bankFactory.createStudentBankacount(200.0, owner1);
        BankAccount SavingBankaccount = this.bankFactory.createSavingBankacount(200.0, owner1);
        OriginalBankaccount.AddCard(card);

        System.out.println(personSerialiazationService.serializeOwner(owner1));

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
        atmService.depositMoney(OriginalBankaccount, 100);

    }
}
