package ConsoleClient;

import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Animal dog = new Dog("Djodjo", 4, Gender.MALE);
        System.out.println(dog);
        Animal cat = new Kitten("Pisana", 6, Gender.FEMALE);
        System.out.println(cat);
        Animal frog = new Frog("Kvaka", 25, Gender.MALE);
        System.out.println(frog);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(frog);
        animals.add(cat);

        int age = 0;
        int countAnimals = animals.size();
        for (Animal animal: animals){
            age+=animal.getAge();
        }
        int average = ( age)/countAnimals;
        System.out.println("Our average age is " + average);
    }


}
