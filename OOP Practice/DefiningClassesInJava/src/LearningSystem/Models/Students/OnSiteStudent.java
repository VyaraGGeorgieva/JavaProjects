package LearningSystem.Models.Students;

public class OnSiteStudent extends CurrentStudent {
    private int numberOfVisits;

    public int getNumberVisits(){
        return this.numberOfVisits;
    }

    private void setNumberOfVisits(int visitsProp){
        if(visitsProp<0){
            throw new IllegalArgumentException("The number of visits enetered cannot be less than 0.");
        }
        this.numberOfVisits = visitsProp;
    }
    public OnSiteStudent(String firstName, String lastName, int age, String studentNumber, double averageGrade, String currentCourse, int numberOfVisits) {
        super(firstName, lastName, age, studentNumber, averageGrade, currentCourse);
        this.getNumberVisits();
    }
    @Override
    public String toString(){
        String result = super.toString() + "\n";
        result += "Number of visits: " + this.getNumberVisits() + "\n";
        return result;
    }
}
