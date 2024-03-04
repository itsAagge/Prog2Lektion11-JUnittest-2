package opgave01.storage;

import com.google.gson.reflect.TypeToken;
import opgave01.models.Person;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public interface FileStorage {
    List<Person> getPeople();

    void addPerson(Person person);

    void save();
}
