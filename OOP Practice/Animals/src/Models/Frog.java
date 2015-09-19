package Models;

public class Frog extends Animal {
    public Frog(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String toString() {
        return String.format(
                "I am a " + this.getClass().getSimpleName() +
                        ". My name is " + this.getName() +
                        ". I am " + this.getAge() + " years old." + ProduceSound());

    }

    @Override
    public String ProduceSound() {
        return "I say Kwak-kwak.";
    }
}
