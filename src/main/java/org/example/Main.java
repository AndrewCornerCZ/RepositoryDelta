package org.example;

import java.util.Scanner;
import com.google.inject.Guice;
import com.google.inject.Injector;
import print.BankInjector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            //App start = new App();
            //start.runbank();
            Injector injector = Guice.createInjector(new BankInjector());
            App app = injector.getInstance(App.class);
            app.runbank();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}