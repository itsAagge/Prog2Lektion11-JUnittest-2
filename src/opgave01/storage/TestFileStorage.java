package opgave01.storage;

import opgave01.models.Person;
import opgave01.models.Role;

import java.util.ArrayList;
import java.util.List;

public class TestFileStorage implements FileStorage {
    ArrayList<Person> people = new ArrayList<>();

    public TestFileStorage() {
        people.add(new Person("Karsten", Role.TEACHER));
        people.add(new Person("Benn", Role.TEACHER));
        people.add(new Person("Hanne", Role.TEACHER));
        people.add(new Person("William", Role.STUDENT));
        people.add(new Person("Alice", Role.STUDENT));
        people.add(new Person("Andrew", Role.STUDENT));
    }

    @Override
    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }

    @Override
    public void addPerson(Person person) {
        people.add(person);
    }

    @Override
    public void save() {

    }
}
