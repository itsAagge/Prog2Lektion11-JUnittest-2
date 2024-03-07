package opgave02.controller;

import opgave02.models.Event;
import opgave02.models.Organizer;
import opgave02.models.Tag;
import opgave02.storage.EventsStorage;
import opgave02.storage.FakeEventsStorage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ControllerTest {

    @Test
    void organizedBy() {
        Controller controller = new Controller(new FakeEventsStorage());

        controller.fetchEvents(Tag.DANS);
        List<Event> actual = controller.organizedBy("info@bora-bora.dk");

        for (Event event : actual) {
            assertEquals("info@bora-bora.dk", event.getOrganizer().getEmail());
        }
    }

    @Test
    void organizedByMock() { // Ignore
        ArrayList<Event> events = new ArrayList<>();
        Organizer organizer = new Organizer("Aarhus Teater", "info@bora-bora.dk");
        Organizer organizer1 = new Organizer("DGI", "info@dgi.dk");
        events.add(new Event("Bora Bora 1", organizer, Tag.DANS));
        events.add(new Event("Bora Bora 2", organizer, Tag.DANS));
        events.add(new Event("Bora Bora 3", organizer, Tag.DANS));
        events.add(new Event("Atletikdans", organizer1, Tag.DANS));
        events.add(new Event("Bora Bora 4", organizer, Tag.DANS));

        EventsStorage eventStorageMock = mock(EventsStorage.class);
        Controller controller = new Controller(eventStorageMock);
        when(eventStorageMock.getEvents("info@bora-bora.dk")).thenReturn(events);

        List<Event> actual = controller.organizedBy("info@bora-bora.dk");

        for (Event event : actual) {
            assertEquals("info@bora-bora.dk", event.getOrganizer().getEmail());
        }
    }
}