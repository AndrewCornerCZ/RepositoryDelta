package org.example.person;

public class OwnerJsonSerializationService implements PersonSerialiazationService {
    public String serializeOwner(Owner owner) {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(owner.getName()).append("\n");
        builder.append("Surname: " ).append(owner.getSurname()).append("\n");
        builder.append("PersonalID: ").append(owner.getPersonalId()).append("\n");
        return builder.toString();
    }
}
