package LearningSystem.Models.Trainers;


import LearningSystem.Models.Person;

public class Trainer extends Person {
    public Trainer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void createCourse(String courseName){
        System.out.println("Course created: " + courseName);
    }

    @Override
    public String toString(){
        String result = "I am a " + this.getClass().getSimpleName();
                result+=super.toString() + "\n";
   
        return result;
    }
}
