package Persons;

public class Person {
    //fields

    private String name;
    private int age;
    private String email;

    //properties
    public String getName() {
        return name;
    }

    private void setName(String nameProp) {
        if (nameProp == null) {
            throw new IllegalArgumentException("Tha name cannot be left null!");
        }
        this.name = nameProp;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int ageProp) {
        if (ageProp<1 || ageProp > 100) {
             throw new IllegalArgumentException("The age muust be [1-100]");
        }
        this.age = ageProp;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String emailProp) {
        if (!(emailProp==null) && !(emailProp.contains("@"))) {
            throw new IllegalArgumentException("The email is incorrect");
        }
        this.email = emailProp;
    }

    //constructors
    public Person(String name, int age, String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    public Person(String name, int age) {
        this(name, age, null);
    }

    public Person(){

    }
    // methods
    @Override
    public String toString() {
        String output;
        if(this.email==null) {
            output = String.format(
                    "My name is: " + this.getName() + ". I am " + this.getAge() + " years old.");
        }
        else{
            output = String.format(
                    "My name is: " + this.getName() + ". I am " + this.getAge() + " years old." + " My email is: " + this.getEmail());
        }
        return output;
    }
}
