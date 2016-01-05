package LearningSystem.Models.Students;

import LearningSystem.Models.Person;

public class Student extends Person {
    //fields
    private String studentNumber;
    private double averageGrade;

    //properties
    public String getStudentNumber(){
        return this.studentNumber;
    }
    private void setStudentNumber(String studentNumProp){
        if (studentNumProp.length()<0){
            throw new IllegalArgumentException("The number should consist of at least one digit.");
        }
            this.studentNumber = studentNumProp;
    }

    public double getAverageGrade(){
        return this.averageGrade;
    }
    private void setAverageGrade(double avgGradeProp){
        if(avgGradeProp<2 || avgGradeProp>6){
            throw new IllegalArgumentException("Grade must be positive");
        }
        this.averageGrade = avgGradeProp;
    }
    //constructors
    public Student(String firstName, String lastName, int age, String studentNumber, double averageGrade)
    {
        super(firstName, lastName, age);
        this.setStudentNumber(studentNumber);
        this.setAverageGrade(averageGrade);
    }


    @Override
    public String toString(){
        String result = "I am a " + this.getClass().getSimpleName() + "\n";
        result+=super.toString() + "\n";
        result+= " Number: " + this.getStudentNumber() + "\n";
        result+=" Average Grade: " + this.getAverageGrade() + "\n";;
        return result;
    }
}
