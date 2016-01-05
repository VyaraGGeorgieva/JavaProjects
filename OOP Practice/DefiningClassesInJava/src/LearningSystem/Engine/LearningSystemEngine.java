package LearningSystem.Engine;

import LearningSystem.Models.Students.*;
import LearningSystem.Models.Trainers.JuniorTrainer;
import LearningSystem.Models.Trainers.SeniorTrainer;
import LearningSystem.Models.Trainers.Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearningSystemEngine {
    public static void main(String[] args) {
        Student studentOne = new Student("Georgi", "Ivanov", 15, "12345", 4.5);
        CurrentStudent studentTwo = new CurrentStudent("Mark", "Markson", 16, "123678", 5.6, "PHP");
        DropOutStudent studentThree = new DropOutStudent("Ivalina", "Boneva",54, "3456", 3.8, "unable to handle studying");
        GraduateStudent studentFour = new GraduateStudent("Ivan", "Ivanov", 45, "90876", 5.9);
        OnlineStudent studentFive = new OnlineStudent("Vyara", "Georgiea",25,"45342", 4.6, "Java");

        Trainer trainerOne = new Trainer("Yavor", "Bozhilov", 35);
        trainerOne.createCourse("PHP");
        trainerOne.createCourse("Java");
        trainerOne.createCourse("OOP");
        SeniorTrainer trainerTwo = new SeniorTrainer("Ivan", "Ivanov", 40);
        trainerTwo.deleteCourse("Java");
        JuniorTrainer trainerThree = new JuniorTrainer("Dimityr", "Dimitrov", 26);
        trainerThree.createCourse("CSharp");

        List<Student> students = new ArrayList<>();
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentFive);

        List<Trainer> trainers = new ArrayList<>();
        trainers.add(trainerOne);
        trainers.add(trainerTwo);
        trainers.add(trainerThree);

        List<Student> studentsSorted = students
                .stream()
                .sorted((st1, st2) -> Double.compare(st1.getAverageGrade(), st2.getAverageGrade()))
                .collect(Collectors.toList());

        for(Student student : studentsSorted){
            System.out.println(student);
        }

        List<Trainer> trainersSorted = trainers
                .stream()
                .sorted((trainer1, trainer2) -> trainer1.getFirstName().compareTo(trainer2.getFirstName()))
                .collect(Collectors.toList());
        for (Trainer trainer : trainersSorted){
            System.out.println(trainer);
        }

    }
}
