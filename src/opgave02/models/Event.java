package opgave02.models;

import java.time.LocalDate;
import java.util.List;

public class Event {
    private String name;
    private Organizer organizer;
    private List<Occurrence> occurrences;
    private String description;
    private String image;

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", organizer=" + organizer +
                ", occurrences=" + occurrences +
                //", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
