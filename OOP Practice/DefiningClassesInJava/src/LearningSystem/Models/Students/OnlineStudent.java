package LearningSystem.Models.Students;

public class OnlineStudent extends CurrentStudent {
    public OnlineStudent(String firstName, String lastName, int age, String studentNumber, double averageGrade, String currentCourse) {
        super(firstName, lastName, age, studentNumber, averageGrade, currentCourse);
    }
    @Override
    public String toString(){
        String result = super.toString() + "\n";
        return result;
    }
}
