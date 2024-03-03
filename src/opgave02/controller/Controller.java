package opgave02.controller;

import opgave02.models.Event;
import opgave02.models.Tag;
import opgave02.storage.EventsStorage;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private EventsStorage eventsStorage = new EventsStorage();
    private List<Event> events = new ArrayList<>();

    public void fetchEvents(Tag tag) {
        events = eventsStorage.getEvents(tag.toString());
    }

    public List<Event> getEvents() {
        return new ArrayList<>(events);
    }

    public List<Event> organizedBy(String email) {
        return new ArrayList<>();
    }
}
