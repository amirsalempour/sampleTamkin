package ir.sadad.baam.learning.sample;

public class User {
    private String name;
    private String lastName;

    public User() {
        System.out.println("default constructor");
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                " studentName='" + name + '\'' +
                ", studentlastName='" + lastName + '\'' +
                '}';
    }
}
