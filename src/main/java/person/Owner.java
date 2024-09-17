package person;

public class Owner {
    private String name;
    private String surname;
    private String personalId;

    public Owner(String name, String surname, String personalId) {
        this.name = name;
        this.surname = surname;
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPersonalId() {
        return personalId;
    }
}
