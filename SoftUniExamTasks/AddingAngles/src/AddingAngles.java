import java.util.Scanner;

public class AddingAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] degrees = new int[count];

        int countMatches = 0;
        for (int i = 0; i <degrees.length; i++) {
            degrees[i] = scanner.nextInt();
            }

        for (int i = 0; i <degrees.length ; i++) {
            for (int j = i+1; j <degrees.length ; j++) {
                for (int k = j+1; k < degrees.length ; k++) {
                    int first = degrees[i];
                    int second = degrees[j];
                    int third = degrees[k];
                    int sum = first + second + third;
                    if (sum % 360 == 0) {
                        System.out.printf("%d + %d + %d = %d degrees\n", first, second,third,sum);
                        countMatches++;
                    }
                }
         }
        }
        if (countMatches == 0){
            System.out.print("No");
        }

    }
}
