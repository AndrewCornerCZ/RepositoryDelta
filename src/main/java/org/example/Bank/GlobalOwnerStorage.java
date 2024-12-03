package org.example.Bank;

import org.example.person.Owner;

import java.util.ArrayList;
import java.util.List;

public class GlobalOwnerStorage {

        public List<Owner> storage;

        public GlobalOwnerStorage() {
            storage = new ArrayList<Owner>();

        }
        public void addOwner( Owner owner) {
            storage.add(owner);
        }

        public List< Owner> getStorage() {
            return storage;
        }
}
