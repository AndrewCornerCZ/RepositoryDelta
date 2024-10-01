package person;

import org.example.Bank.AccountNumberGenerator;

public class OwnerFactory {

    private PersonalIdValidator personIdValidator;
    private AccountNumberGenerator bankacountNumberGenerator;

    public OwnerFactory(AccountNumberGenerator bankacountNumberGenerator, PersonalIdValidator personIdValidator) {
        this.personIdValidator = personIdValidator;
        this.bankacountNumberGenerator = bankacountNumberGenerator;
    }

    public Owner createOwner(String name, String lastName, String personalId) {

        if(!this.personIdValidator.isValid(personalId)) {
            System.out.println("Invalid personal ID");
        }
        System.out.println("Number:" + bankacountNumberGenerator.generateBankAccountNumber());

        return new Owner(name, lastName, personalId);
    }
}
