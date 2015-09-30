import java.util.Arrays;
import java.util.Scanner;
public class PossibleTrianges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //stores the whole input
        String inputToken = scanner.nextLine();
        //a variable added as a checker
        int countPossibleTriangles = 0;

        //itirate over the input till the final line
        while(!inputToken.equals("End")){
            String[] sidesAsStrings = inputToken.split("\\s+");

            double[] sizeSides = new double[3];

            for (int i = 0; i <sizeSides.length ; i++) {
                sizeSides[i] = Double.parseDouble(sidesAsStrings[i]);
            }
            //sort in order to take them in asc order
            Arrays.sort(sizeSides);
            //attribute values
                if (sizeSides[0] + sizeSides[1] > sizeSides[2]){
                System.out.format(
                        "%.2f+%.2f>%.2f",
                        sizeSides[0],
                        sizeSides[1],
                        sizeSides[2]
                );
                countPossibleTriangles++;
            }
            //!!!
            inputToken = scanner.nextLine();
            }
        if (countPossibleTriangles == 0){
            System.out.println("No");
        }

    }
}
