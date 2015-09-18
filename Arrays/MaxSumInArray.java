import java.util.Scanner;

public class MaxSumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        scanner.nextLine();
        int lengthSummedElements = scanner.nextInt();
        scanner.nextLine();
        String[] elements = scanner.nextLine().split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
             numbers[i] = Integer.parseInt(elements[i]);
        }

        int currentSum = 0;
        int maxSum = 0;
        int beginningLine = 0;
        int maxArrayElementsCount = 1;

        for (int i = 0; i <= arrayLength-lengthSummedElements ; i++) {
            int j = i;
            for (; j < i + lengthSummedElements; j++) {
                currentSum += numbers[j];
            }
            if (currentSum>maxSum){
                maxSum = currentSum;
                beginningLine = i;
                maxArrayElementsCount = j-i;
            }
            currentSum=0;
        }
        for (int i = beginningLine; i <beginningLine+maxArrayElementsCount ; i++) {
            if (i!=beginningLine+maxArrayElementsCount -1){
                System.out.print(numbers[i] + " ");
            }
            else
                System.out.print(numbers[i]);
        }
    }
}
