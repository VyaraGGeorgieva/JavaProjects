import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        //remove nulls and trim
        List<String> list = new ArrayList<String>();

        for (String string : input) {
            if (string != null && string.length() > 0) {
                list.add(string.trim());
            }
        }
        input = list.toArray(new String[list.size()]);

        double totalSum = 0;
        for (String string : input) {
            double number = Double.parseDouble(string.substring(1, string.length() - 1));
            if (Character.isUpperCase(string.charAt(0))) {
                number /= GetPositionInAlphabet(string.charAt(0));
            } else {
                number *= GetPositionInAlphabet(string.charAt(0));
            }
            if (Character.isUpperCase(string.charAt(string.length() - 1))) {
                number -= GetPositionInAlphabet(string.charAt(string.length() - 1));
            } else {
                number += GetPositionInAlphabet(string.charAt(string.length() - 1));
            }
            totalSum += number;
        }

        System.out.printf("%.2f", totalSum);
    }

    public static int GetPositionInAlphabet(char ch) {
        if (Character.isUpperCase(ch)) {
            return ((int) ch - (int) 'A') + 1;
        } else {
            return ((int) ch - (int) 'a') + 1;
        }
    }
}