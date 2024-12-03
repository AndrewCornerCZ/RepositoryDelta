package serialization;

import com.google.inject.Inject;
import storage.Storage;

public class BankSerializationService {
    public static final String pathFile = "accounts.json";

    @Inject
    private BankJsonDataSerialization bankJsonDataSerialization;
    @Inject
    private Storage storage;
    @Inject
    private BankJsonDataFacade bankJsonDataFacade;

    public void saveBank() {
        BankJsonData bankJsonData = this.bankJsonDataFacade.createBankJsonDataFromGlobalStorage();
        String serializationString = this.bankJsonDataSerialization.serialize(bankJsonData);

        this.storage.save(serializationString, BankSerializationService.pathFile);
    }

    public void loadBank() {
        String bankDataJsonString = this.storage.read(BankSerializationService.pathFile);
        BankJsonData bankJsonData = this.bankJsonDataSerialization.deserialize(bankDataJsonString);
        this.bankJsonDataFacade.createBankDataFromBankJsonData(bankJsonData);
    }
}
