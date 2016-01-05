package LearningSystem.Models.Students;

public class DropOutStudent extends Student {
    private String dropOutReason;

    public String getDropOutReason(){
        return this.dropOutReason;
    }

    public DropOutStudent(String firstName, String lastName, int age, String studentNumber, double averageGrade, String dropoutReason) {
        super(firstName, lastName, age, studentNumber, averageGrade);
        this.getDropOutReason();
    }

    public void Reapply(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        String result = super.toString() + "\n";
        result+="Reason for dropping-out: " + this.getDropOutReason();
        return result;
    }
}
