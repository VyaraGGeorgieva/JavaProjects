package Models;

public class Student extends Human {

    private String facultyNumber;
    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if ((facultyNumber.length()>=5) &&(facultyNumber.length()<=10)){
            this.facultyNumber = facultyNumber;
        }
        throw new IllegalArgumentException("The faculty number must be from 5 to 10 digits");
    }

    @Override
    public String toString() {
        return String.format(
                "My name is : " + this.getFirstName() + " " + this.getLastName() +
                " I am a " + Student.class.getSimpleName()+
                        " My faculty number is: " + this.getFacultyNumber()
        );
    }
}
