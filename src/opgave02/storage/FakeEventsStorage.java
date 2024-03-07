package opgave02.storage;

import opgave02.models.Event;
import opgave02.models.Organizer;
import opgave02.models.Tag;

import java.util.ArrayList;
import java.util.List;

public class FakeEventsStorage implements EventsStorage {
    @Override
    public List<Event> getEvents(String tag) {
        ArrayList<Event> events = new ArrayList<>();
        Organizer organizer = new Organizer("Aarhus Teater", "info@bora-bora.dk");
        Organizer organizer1 = new Organizer("DGI", "info@dgi.dk");
        events.add(new Event("Bora Bora 1", organizer, Tag.DANS));
        events.add(new Event("Bora Bora 2", organizer, Tag.DANS));
        events.add(new Event("Bora Bora 3", organizer, Tag.DANS));
        events.add(new Event("Atletikdans", organizer1, Tag.DANS));
        events.add(new Event("Bora Bora 4", organizer, Tag.DANS));

        return events;
    }
}
