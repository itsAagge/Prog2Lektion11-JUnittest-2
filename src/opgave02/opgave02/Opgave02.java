package opgave02.opgave02;

import opgave02.controller.Controller;
import opgave02.models.Event;
import opgave02.models.Tag;
import opgave02.storage.DetSkerIAarhusEventsStorage;

public class Opgave02 {
    public static void main(String[] args) {
        Controller controller = new Controller(new DetSkerIAarhusEventsStorage());
        controller.fetchEvents(Tag.MUSIK);
        for (Event event : controller.getEvents()) {
            System.out.println(event);
        }
    }
}
