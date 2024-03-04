package opgave01.controller;

import opgave01.models.Person;
import opgave01.models.Role;
import opgave01.storage.FileStorage;
import opgave01.storage.TestFileStorage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    @DisplayName("Filter for Students")
    void filterTest() {
        FileStorage fileStorage = new TestFileStorage();
        Controller controller = new Controller(fileStorage);

        boolean noTeachers = true;
        for (Person person : controller.filter(Role.STUDENT)) {
            if (person.getRole().equals(Role.TEACHER)) {
                noTeachers = false;
            }
        }
        assertTrue(noTeachers);
    }

    @Test
    void addPerson() {
        FileStorage fileStorage = new TestFileStorage();
        Controller controller = new Controller(fileStorage);

        Person person = new Person("Christian", Role.STUDENT);
        controller.addPerson(person);

        assertTrue(controller.getPeople().contains(person));
    }

    @Test
    void createPerson() {
        FileStorage fileStorage = new TestFileStorage();
        Controller controller = new Controller(fileStorage);
        String name = "Daniel";
        Role role = Role.STUDENT;

        Person createdPerson = controller.createPerson(name, role);
        controller.addPerson(createdPerson);

        boolean personExists = false;
        for (Person person : controller.getPeople()) {
            if (person.getName().equals(name) && person.getRole().equals(role)) {
                personExists = true;
            }
        }
        assertTrue(personExists);
    }
}