package person;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.AccountNumberGenerator;
@Singleton
public class OwnerFactory {

    @Inject
    private PersonalIdValidator personIdValidator;
    @Inject
    private AccountNumberGenerator bankacountNumberGenerator;


    public Owner createOwner(String name, String lastName, String personalId) {

        if(!this.personIdValidator.isValid(personalId)) {
            System.out.println("Invalid personal ID");
        }
        System.out.println("Number:" + bankacountNumberGenerator.generateBankAccountNumber());

        return new Owner(name, lastName, personalId);
    }
}
