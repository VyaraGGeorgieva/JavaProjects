package LearningSystem.Models.Trainers;

public class SeniorTrainer extends Trainer {
    public SeniorTrainer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void deleteCourse(String courseNameDeleted){
        System.out.println("Course deleted: " + courseNameDeleted);
    }

    @Override
    public String toString(){
        String result =  super.toString();
        return result;
    }
}
