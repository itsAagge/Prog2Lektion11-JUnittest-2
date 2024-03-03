package opgave02.models;

public class Organizer {
    private String name;
    private String email;
    private String url;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
