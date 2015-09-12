import java.util.Scanner;

public class MaxSequanceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Split the str input into tokens
        String [] input = scanner.nextLine().split(", ");
        //2. Assign the length and the values of the Str array to and int Arr
        int[] tokens = new int[input.length];

        for (int i = 0; i < input.length; i++) {
             tokens[i] = Integer.parseInt(input[i]);
        }

        //3. Initialize variables to check the movement within the code
        int count;
        int beginningPrintedSequence = 0;
        int maxLength = 0;

        for (int i = 0; i < tokens.length; i++) {
            //4. Check if the sequent element is the same as the previous
            count = 0;
            int secondEl = i;
            while (tokens[i] == tokens[secondEl]) {
                //4.1 Keep record of the number of elements
                count++;
                secondEl++;
                //4.2 keep within the arr limit
                if (secondEl >= tokens.length) {
                    break;
                }
            }
                if (count > maxLength){
                    maxLength = count;
                    beginningPrintedSequence = i;
                }
            }

        for (int i = beginningPrintedSequence; i <= beginningPrintedSequence+maxLength -1; i++) {
            if (i!=beginningPrintedSequence+maxLength-1){
                System.out.print(tokens[i] + ", ");
            }
            else
                System.out.print(tokens[i]);
        }
    }
}
