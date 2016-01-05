import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SchoolSystem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberofStudents = reader.nextInt();
        reader.nextLine();
        TreeMap<String,TreeMap<String, ArrayList<Integer>>> students = new TreeMap<String,TreeMap<String, ArrayList<Integer>>>();

        for (int i = 0; i <numberofStudents ; i++) {
            String[] input = reader.nextLine().split(" ");
            String fullName = input[0] + " " + input[1];
            String subject = input[2];
            int mark = Integer.parseInt(input[3]);
            TreeMap<String, ArrayList<Integer>> subjects = new TreeMap<>();

            if (students.containsKey(fullName)){
                subjects = students.get(fullName);
                if(!students.containsKey(subject)){
                    subjects.put(subject,new ArrayList<>());
                }
                subjects.get(subject).add(mark);
            }
            else{
                ArrayList<Integer> marks = new ArrayList<>();
                marks.add(mark);
                subjects.put(subject,marks);
                students.put(fullName,subjects);
            }
        }

        for (Map.Entry<String, TreeMap<String, ArrayList<Integer>>> student : students.entrySet()){
            String studentName = student.getKey();
            TreeMap<String, ArrayList<Integer>> marksSets = student.getValue();
            String output = studentName + ": [";
            ArrayList<Double> avgMarks= new ArrayList<>();
            for(Map.Entry<String, ArrayList<Integer>> subject :marksSets.entrySet() ){
                String subjectName = subject.getKey();
                Object[] mrks = subject.getValue().toArray();
            output += subjectName + " - " + String.format("%.2f", averageSum(mrks)) + ", ";
            avgMarks.add(averageSum(mrks));
        }

        output = output.substring(0, output.length() - 2) + "]";
        System.out.print(output + "\n");

        }

    }

    public static double averageSum (Object[] marks){
        double sum = 0;
        for (int i = 0; i < marks.length ; i++) {
            sum+= (int)marks[i];
        }
        double average = sum/marks.length;
        return average;
    }
}
