package opgave02.models;

import java.time.LocalDate;
import java.util.List;

public class Event {
    private String name;
    private Organizer organizer;
    private Tag tag;
    private List<Occurrence> occurrences;
    private String description;
    private String image;

    public Event(String name, Organizer organizer, Tag tag) {
        this.name = name;
        this.organizer = organizer;
        this.tag = tag;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

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
