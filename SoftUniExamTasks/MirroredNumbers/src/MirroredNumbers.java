import java.util.Scanner;
public class MirroredNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());
        String [] inputTokens = scanner.nextLine().split(" ");

        int count = 0;
        for (int i = 0; i <numbersCount; i++) {
            for (int j = i+1; j < numbersCount; j++) {
                String firstNumber = inputTokens[i];
                String secondNumber = inputTokens[j];
                if (
                        firstNumber.charAt(0) == secondNumber.charAt(3) &&
                        firstNumber.charAt(1)==secondNumber.charAt(2) &&
                        firstNumber.charAt(2) == secondNumber.charAt(1) &&
                        firstNumber.charAt(3) == secondNumber.charAt(0)){
                    System.out.println(firstNumber + "<!>" + secondNumber);
                    count++;
                }

            }
        }

        if (count == 0){
            System.out.println("No");
        }
    }
}
