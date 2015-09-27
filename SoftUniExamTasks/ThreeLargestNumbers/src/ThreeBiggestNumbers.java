import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeBiggestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        scanner.nextLine();

        BigDecimal[] numbersInput = new BigDecimal[numbersCount];
        for (int i = 0; i <numbersInput.length; i++) {
            numbersInput[i] = scanner.nextBigDecimal();
        }
        Arrays.sort(numbersInput);

        int count = 3;
        for (int i = numbersInput.length-1; i >=0 && count>0 ; i--, count--) {
            System.out.println(numbersInput[i].toPlainString());
        }


    }
}
