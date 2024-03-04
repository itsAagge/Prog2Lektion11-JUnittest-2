package opgave01.controller;

import opgave01.models.Person;
import opgave01.models.Role;
import opgave01.storage.FileStorage;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    FileStorage fileStorage;

    public Controller(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

    /**
     *
     * @param role
     * @return List<Person> where all person has the given role
     */
    public List<Person> filter(Role role) {
        List<Person> peopleWithRole = new ArrayList<>();
        for (Person person : getPeople()) {
            if (person.getRole().equals(role)) {
                peopleWithRole.add(person);
            }
        }
        return peopleWithRole;
    }

    /**
     *
     * @return all persons
     */
    public List<Person> getPeople() {
        return fileStorage.getPeople();
    }

    /**
     * Adds a new person
     * @param person
     */
    public void addPerson(Person person) {
        if (!fileStorage.getPeople().contains(person)) {
            fileStorage.addPerson(person);
        }
    }

    public Person createPerson(String name, Role role) {
        return new Person(name, role);
    }

    /**
     * Persists all people
     */
    public void save() {
        fileStorage.save();
    }
}
