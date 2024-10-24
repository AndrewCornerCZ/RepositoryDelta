package org.example;

import com.google.inject.Inject;
import org.example.Bank.*;
import org.example.Bank.Card.BankCard;
import org.example.Bank.Card.BankCardFactory;
import org.example.Bank.exception.NoMoneyOnAccountException;
import org.example.Bank.exception.WrongPinException;
import org.example.person.Owner;
import org.example.person.OwnerFactory;
import org.example.person.PersonSerialiazationService;
import org.example.print.Calc;
import org.example.print.Calcul;

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

        if (studentBankAccount instanceof StudentBankAccount)
        {
            String expire = ((StudentBankAccount) studentBankAccount).getStudies();
            System.out.println(expire);
        }

        if (savingBankAccount instanceof Interesting)
        {
            double interest = ((Interesting) savingBankAccount).getInterest();
            System.out.println(interest);
        }

        atmService.depositMoney(bankCard.getNumber(), bankCard.getPin(), 100);
        atmService.withdrawMoney(bankCard.getNumber(), bankCard.getPin(), 100);
        interestingSevice.run();
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
        Calc kalk = new Calcul();
        System.out.println(kalk.add(a, b));
        System.out.println(kalk.div(a, b));
        System.out.println(kalk.sub(a, b));
        System.out.println(kalk.mul(a, b));
    }
}
