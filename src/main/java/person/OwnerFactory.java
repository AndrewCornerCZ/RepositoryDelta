package person;

public class OwnerFactory {

    private personalIdValidator personIdValidator;

    public OwnerFactory() {
        this.personIdValidator = new personalIdValidator();
    }

    public Owner createOwner(String name, String lastName, String personalId) {

        if(!this.personIdValidator.isValid(personalId)) {
            System.out.println("Invalid personal ID");
        }

        return new Owner(name, lastName, personalId);
    }
}
