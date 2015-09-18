package ConsoleClient;

import Models.Student;
import Models.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        //initializeStudents
        Student firstStudent = new Student("Peter", "Petrov", "99123456");
        Student secondStudent = new Student("Nedelina", "Dimitrova", "345678");
        Student thirdStudent = new Student("Ivan", "Dramgiev", "987654");

        //add to list
        List<Student> students = new ArrayList<Student>();
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);

        //sortStudents
        Comparator<Student> compareByFacultyNum =
        (studentOne, studentTwo) -> studentOne.getFacultyNumber().compareTo(studentTwo.getFacultyNumber());
        List <Student> sortedStudents = students.stream()
                .sorted(compareByFacultyNum).collect(Collectors.toList());

        for (Student student : sortedStudents){
            System.out.println(student);
        }

        //initialize workers
        Worker firstWorker = new Worker("Anatoli", "Dimitrov", 200.00, 40);
        Worker secondWorker = new Worker("Panaiot", "Georgiev", 300.00, 30);
        Worker thirdWorker = new Worker("Georgi", "Petrov", 400.00, 35);

        //add workers to list
        List<Worker> workers = new ArrayList<Worker>();
        workers.add(firstWorker);
        workers.add(secondWorker);
        workers.add(thirdWorker);

        //sort workers PROBLEM
        Comparator<Worker> earnsMoreMoney =
                (workerOne, workerTwo) -> workerOne.MoneyPerHour()
                //TODO
        List <Worker> sortedWorkers = workers.stream()
                .sorted(earnsMoreMoney).collect(Collectors.toList());

        for (Worker worker : sortedWorkers){
            System.out.println(worker);
        }
    }
}
