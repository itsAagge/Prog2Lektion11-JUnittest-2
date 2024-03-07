package opgave02.models;

import opgave02.storage.DetSkerIAarhusEventsStorage;

public class Test {
    public static void main(String[] args) {
        var storage = new DetSkerIAarhusEventsStorage();
        storage.getTags();
        var events = storage.getEvents("byliv");

    }
}
