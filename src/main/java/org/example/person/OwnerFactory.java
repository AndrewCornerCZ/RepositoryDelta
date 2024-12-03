package org.example.person;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.Bank.AccountNumberGenerator;
import org.example.Bank.GlobalOwnerStorage;

@Singleton
public class OwnerFactory {

    @Inject
    private PersonalIdValidator personIdValidator;
    @Inject
    private AccountNumberGenerator bankacountNumberGenerator;
    @Inject
    private GlobalOwnerStorage globalOwnerStorage;

    public Owner createOwner(String name, String lastName, String personalId) {

        if(!this.personIdValidator.isValid(personalId)) {
            System.out.println("Invalid personal ID");
        }
        System.out.println("Number:" + bankacountNumberGenerator.generateBankAccountNumber());
        Owner owner = new Owner(name, lastName, personalId);
        globalOwnerStorage.addOwner(owner);
        return owner;
    }
}
