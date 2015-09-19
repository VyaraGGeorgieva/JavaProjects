package Models;

public class Kitten extends Cat {
    public Kitten(String name, int age, Gender gender) {
        super(name, age, gender);
        gender = Gender.FEMALE;
    }
}
