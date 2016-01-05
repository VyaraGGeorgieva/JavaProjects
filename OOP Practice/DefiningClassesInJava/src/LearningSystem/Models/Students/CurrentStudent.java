package LearningSystem.Models.Students;

public class CurrentStudent extends Student {
    private String currentCourse;


    public String getCourse(){
        return this.currentCourse;
    }

    public void setCurrentCourse(String currentCourseProp){
        if(currentCourseProp.length() < 2){
            throw new IllegalArgumentException("The name is uncorrect, too short, make it at least 2 chars long");
        }
        this.currentCourse = currentCourseProp;
    }

    public CurrentStudent(String firstName, String lastName, int age, String studentNumber, double averageGrade, String currentCourse) {
        super(firstName, lastName, age, studentNumber, averageGrade);
        this.setCurrentCourse(currentCourse);
    }

    @Override
    public String toString(){
        String result = super.toString() + "\n";
        result+="My current course is: " + this.getCourse();
        return result;
    }
}
