package serialization;

import com.google.inject.Inject;
import org.example.Bank.BankAccount;
import org.example.Bank.GlobalBankStorage;
import org.example.Bank.GlobalOwnerStorage;
import org.example.person.Owner;

public class BankJsonDataFacade {

    @Inject
    BankJsonDataFactory bankJsonDataFactory;

    @Inject
    private GlobalBankStorage globalBankStorage;
    @Inject
    private GlobalOwnerStorage globalOwnerStorage;

    public BankJsonData createBankJsonDataFromGlobalStorage() {
        BankJsonData bankJsonData = bankJsonDataFactory.createBankJson();
        bankJsonData.owners = globalOwnerStorage.getStorage();
        bankJsonData.bankAccounts = globalBankStorage.getStorage();
        return bankJsonData;
    }

    public void createBankDataFromBankJsonData(BankJsonData bankJsonData) {
        for (Owner owner : bankJsonData.owners) {
            this.globalOwnerStorage.addOwner(owner);
        }
        for (BankAccount bankAccount : bankJsonData.bankAccounts) {
            this.globalBankStorage.addBankAccount(bankAccount);
        }
    }
}
