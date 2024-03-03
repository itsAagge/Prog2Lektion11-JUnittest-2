package opgave01.models;


public class Person {
    private String name;
    private Role role;

    public Person(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person { name: " + name + ", role: " + role + " }";
    }
}
