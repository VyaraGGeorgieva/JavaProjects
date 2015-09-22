import java.math.BigDecimal;
import java.util.Scanner;

public class Tribonacchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal firstTr = scanner.nextBigDecimal();
        BigDecimal secondTr = scanner.nextBigDecimal();
        BigDecimal thirdTr = scanner.nextBigDecimal();
        BigDecimal nCount = scanner.nextBigDecimal();

        if (nCount.equals("1")){
            System.out.println(firstTr);
        }
        if (nCount.equals("2")){
            System.out.println(secondTr);
        }
        if (nCount.equals("3")){
            System.out.println(thirdTr);
        }

        for (int i = 3; i <nCount.doubleValue(); i++) {
            BigDecimal nth= firstTr.add(secondTr).add(thirdTr);
            firstTr = secondTr;
            secondTr= thirdTr;
            thirdTr = nth;
        }
        System.out.print(thirdTr);
    }
}
