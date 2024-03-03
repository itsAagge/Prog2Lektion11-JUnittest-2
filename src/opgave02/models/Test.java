package opgave02.models;

import opgave02.storage.EventsStorage;

public class Test {
    public static void main(String[] args) {
        var storage = new EventsStorage();
        storage.getTags();
        var events = storage.getEvents("byliv");

    }
}
