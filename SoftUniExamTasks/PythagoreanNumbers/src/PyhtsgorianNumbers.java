import java.util.HashSet;
import java.util.Scanner;

public class PyhtsgorianNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        HashSet<Integer> squares = new HashSet<>();
        for (int num : numbers) {
            squares.add(num * num);
        }
        int count = 0;
        for (int a : numbers) {
            for (int b : numbers) {
                int cSquare = a*a + b*b;
                if (a <= b && squares.contains(cSquare)) {
                    int c = (int)Math.sqrt(cSquare);
                    System.out.printf(
                            "%d*%d + %d*%d = %d*%d\n",
                            a, a, b, b, c, c);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        }
    }

}
