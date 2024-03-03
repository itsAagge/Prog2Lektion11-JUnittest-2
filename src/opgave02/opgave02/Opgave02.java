package opgave02.opgave02;

import opgave02.controller.Controller;
import opgave02.models.Event;
import opgave02.models.Tag;

public class Opgave02 {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.fetchEvents(Tag.MUSIK);
        for (Event event : controller.getEvents()) {
            System.out.println(event);
        }
    }
}
