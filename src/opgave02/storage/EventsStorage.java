package opgave02.storage;

import opgave02.models.Event;

import java.util.List;

public interface EventsStorage {
    List<Event> getEvents(String tag);
}
