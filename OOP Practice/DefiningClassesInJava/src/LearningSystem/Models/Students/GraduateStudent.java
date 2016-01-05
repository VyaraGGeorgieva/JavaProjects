package LearningSystem.Models.Students;

public class GraduateStudent extends Student {
    public GraduateStudent(String firstName, String lastName, int age, String studentNumber, double averageGrade) {
        super(firstName, lastName, age, studentNumber, averageGrade);
    }

    @Override
    public String toString(){
        String result = super.toString() + "\n";
        return result;
    }
}
