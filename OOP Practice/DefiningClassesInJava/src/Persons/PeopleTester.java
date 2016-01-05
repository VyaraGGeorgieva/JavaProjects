package Persons;

public class PeopleTester {
    public static void main(String[] args) {
        Person peter = new Person("Peter", 23);
        System.out.println(peter);

        Person stefan = new Person();
        stefan.setName("Stefan");
        stefan.setEmail("abv@bg");
        stefan.setAge(67);
        System.out.println(stefan);

        Person tom = new Person("Tom",56);
        System.out.println(tom);

    }
}
