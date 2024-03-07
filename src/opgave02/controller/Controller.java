package opgave02.controller;

import opgave02.models.Event;
import opgave02.models.Tag;
import opgave02.storage.DetSkerIAarhusEventsStorage;
import opgave02.storage.EventsStorage;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private EventsStorage eventsStorage;
    private List<Event> events = new ArrayList<>();

    public Controller(EventsStorage eventsStorage) {
        this.eventsStorage = eventsStorage;
    }

    public void fetchEvents(Tag tag) {
        events = eventsStorage.getEvents(tag.toString());
    }

    public List<Event> getEvents() {
        return new ArrayList<>(events);
    }

    public List<Event> organizedBy(String email) {
        ArrayList<Event> foundEvents = new ArrayList<>();
        for (Event event : getEvents()) {
            if (event.getOrganizer().getEmail().equals(email)) {
                foundEvents.add(event);
            }
        }
        return foundEvents;
    }
}
