//Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers between 1 and 20, which, if added or subtracted, result in the target.

import java.util.Scanner;
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int target = Integer.parseInt(reader.next());
        int output = hitTheTarget(target);
        }

    private static int hitTheTarget(int target) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                int calculation = i + j;
                if (calculation == target) {
                    System.out.println(i + "+" + j + "=" + target);
                }
                int division = i - j;
                if (division == target) {
                    System.out.println(i + "-" + j + "=" + target);
                }
            }
        }
        return target;
    }
}
