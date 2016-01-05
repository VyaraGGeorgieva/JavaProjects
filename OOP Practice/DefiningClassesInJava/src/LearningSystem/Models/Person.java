package LearningSystem.Models;


public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    private void setFirstName( String firstNameProp){
        if(firstNameProp.length()<=2){
            throw new IllegalArgumentException("Enter more than 2 characters");
        }
        this.firstName = firstNameProp;
    }

    public String getLastName(){
        return this.lastName;
    }
    private void setLastName( String lastNameProp){
        if(lastNameProp.length()<=2){
            throw new IllegalArgumentException("Enter more than 2 characters");
        }
        this.lastName = lastNameProp;
    }

    public int getAge(){
        return this.age;
    }
     private void setAge(int ageProp){
         if(ageProp<0 || ageProp>100){
             throw new IllegalArgumentException("The age must be within limits!");
         }
         this.age = ageProp;
     }

    public Person(String firstName, String lastName, int age){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }
    @Override
    public String toString(){
        return String.format(
                " First name: " + this.getFirstName()+ "\n" +
                        " Last Name: " + this.getLastName() + "\n" +
                        " Age: " + this.getAge() + "\n"
        );
    }

}
