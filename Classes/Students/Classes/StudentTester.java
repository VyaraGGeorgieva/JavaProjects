package Classes;

import Enums.Specialties;
import Enums.Univiersities;

public class StudentTester {
    public static Student oneParameterStudent;
    public static Student threeParametersStudent;
    public static Student fourParametersStudent;


    public static void main(String[] args) {
        oneParameterStudent = new Student("Peter Petrov");
        System.out.println(oneParameterStudent);
        threeParametersStudent = new Student("Mariya Marinova", 3, Specialties.LITERATURE);
        System.out.println(threeParametersStudent);
        fourParametersStudent = new Student ("Anton Dimitrov", 3, Specialties.MATHEMATICS, Univiersities.OXFORD, "anton@gmail.com", "0776767676");
        System.out.println(fourParametersStudent);

        System.out.println("There are " + Student.studentCount + " students so far.");
    }
}
