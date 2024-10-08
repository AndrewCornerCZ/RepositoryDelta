package person;

import com.google.inject.Singleton;

@Singleton
public class PersonalIdValidator {

    public boolean isValid(String personalId) {
        return true;
    }
}
