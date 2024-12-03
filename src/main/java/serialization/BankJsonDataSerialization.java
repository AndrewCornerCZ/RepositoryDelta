package serialization;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.inject.Inject;

public class BankJsonDataSerialization {
    @Inject
    private Gson gson;

    public String serialize(BankJsonData data) {
        return gson.toJson(data);
    }

    public BankJsonData deserialize(String data) {
        return this.gson.fromJson(data, BankJsonData.class);
    }

}
