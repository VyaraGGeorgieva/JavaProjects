package Classes;

import Enums.Specialties;
import Enums.Univiersities;

public class Student {

    static int studentCount;

    private String fullName = "Marin Marinov";
    private int course = 2;
    private Specialties specialty = Specialties.COMPTUTING;
    private Univiersities university = Univiersities.CAMBRIDGE;
    private String email = "pataer.petrov@gmail.com";
    private String phoneNumber ="0889076767";

    public Student(String name, int numberCourses, Specialties specialty, Univiersities university, String email, String telephoneNumber){
        this.fullName = name;
        this.course = numberCourses;
        this.specialty = specialty;
        this.university = university;
        this.email = email;
        this.phoneNumber = telephoneNumber;
        studentCount++;
    }

    public Student(String fullName) {
        this.fullName = fullName;
        studentCount++;
    }

    public Student(String fullName, int course, Specialties specialty) {
        this.fullName = fullName;
        this.course = course;
        this.specialty = specialty;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Specialties getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialties specialty) {
        this.specialty = specialty;
    }

    public Univiersities getUniversity() {
        return university;
    }

    public void setUniversity(Univiersities university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Name: " + this.getFullName() +
                " Courses: " + this.getCourse() +
                " Specialties: " + this.getSpecialty() +
                " University: " + this.getUniversity() +
                " Email: " + this.getEmail() +
                " PhoneNumber: " + this.getPhoneNumber();
    }
}
