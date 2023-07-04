package sample;

public class Human {
    private String name;
    private String lastName;
    private Gender gender;

    public Human(String name, String lastName, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", lastName=" + lastName + ", gender=" + gender + "]";
    }
}