import java.util.Scanner;

public class LongestUprisingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //split
        String[] input = scanner.nextLine().split(", ");
        //assign
        int[] tokens = new int[input.length];
        for (int i = 0; i <input.length ; i++) {
            tokens[i] = Integer.parseInt(input[i]);
        }
        //initialize
        int count = 0;
        int beginningPrintedSequence = 0;
        int maxLength = 0;

        for (int i = 0; i <tokens.length-1 ; i++) {
            int firstEl = i;
            int secondEl = i+1;
            count = 1;
            while(tokens[firstEl] < tokens[secondEl]) {

                count++;
                secondEl++;
                firstEl++;

                if (secondEl >= tokens.length) {
                    break;
                }
            }
            if (count>maxLength){
                maxLength = count;
                beginningPrintedSequence = i;
            }
        }
        for (int i = beginningPrintedSequence; i <=beginningPrintedSequence+maxLength-1 ; i++) {
            if (i!=beginningPrintedSequence+maxLength-1){
                System.out.print(tokens[i] + ", ");
            }
            else
                System.out.print(tokens[i]);
        }

    }
}
