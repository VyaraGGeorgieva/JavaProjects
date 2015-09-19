package Models;

public class TomCat extends Cat {
    public TomCat(String name, int age, Gender gender) {
        super(name, age, gender);
        gender = Gender.MALE;
    }
}
