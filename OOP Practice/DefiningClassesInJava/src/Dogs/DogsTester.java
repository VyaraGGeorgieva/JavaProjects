package Dogs;

public class DogsTester {
    public static void main(String[] args) {
        Dog first = new Dog("Ma", "shepherd");
        Dog second = new Dog("Djaki", "stray");
        System.out.print(first);
        first.Bark();
        System.out.print(second);
        second.Bark();
    }

}
