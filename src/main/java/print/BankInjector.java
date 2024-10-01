package print;

import com.google.inject.AbstractModule;
import org.example.Bank.AccountNumberGenerator;
import org.example.Bank.SLBankacountGenerator;

public class BankInjector extends AbstractModule{
    @Override
    protected void configure() {
        this.bind(AccountNumberGenerator.class).to(SLBankacountGenerator.class);
    }
}
