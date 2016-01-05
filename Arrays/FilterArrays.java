//Write a program that filters an array of strings, leaving only the strings with length greater than 3 characters. Use .filter()

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArrays {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] input = reader.nextLine().split("\\s");

        List<String> result =
                Arrays.stream(input)
                        .filter(w -> w.length() >3)
                        .collect(Collectors.toList());
        System.out.println(result);
    }
}
