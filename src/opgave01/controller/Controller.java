package opgave01.controller;

import opgave01.models.Person;
import opgave01.models.Role;
import opgave01.storage.EaaaFileStorage;

import java.util.List;

public class Controller {
    EaaaFileStorage eaaaStorage;

    public Controller() {
        this.eaaaStorage = new EaaaFileStorage();
    }

    /**
     *
     * @param role
     * @return List<Person> where all person has the given role
     */
    public List<Person> filter(Role role) {
        return null;
    }

    /**
     *
     * @return all persons
     */
    public List<Person> getPeople() {
        return null;
    }

    /**
     * Adds a new person
     * @param person
     */
    public void addPerson(Person person) {
    }

    /**
     * Persists all people
     */
    public void save() {
    }
}
