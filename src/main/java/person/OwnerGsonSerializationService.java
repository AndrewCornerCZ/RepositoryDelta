package person;

import com.google.gson.Gson;

public class OwnerGsonSerializationService implements PersonSerialiazationService {
    public String serializeOwner(Owner owner) {
        Gson gson = new Gson();
        return gson.toJson(owner, Owner.class);
    }

}
