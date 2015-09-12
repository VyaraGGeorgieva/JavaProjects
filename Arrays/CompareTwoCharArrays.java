import java.util.Scanner;

public class CompareTwoCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        char firstLetterFirstArr = firstLine.charAt(0);
        char firstLetterSecondArr = secondLine.charAt(0);
        boolean areEqual = false;

        for (int i = 0; i < firstLine.length(); i++) {
            for (int j = 0; j < secondLine.length(); j++) {
                if (firstLetterFirstArr!=firstLetterSecondArr){
                    areEqual = false;
                    if (firstLetterFirstArr>firstLetterSecondArr){
                        break;
                    }
                    else if (firstLetterFirstArr<firstLetterSecondArr){
                        break;
                    }
                }
            }
        }

        if (areEqual = false){
            if(firstLetterFirstArr>firstLetterSecondArr){
                System.out.print(firstLine);
            }
            if(firstLetterFirstArr<firstLetterSecondArr){
                System.out.print(firstLine);
            }
        }
        else
            System.out.print(secondLine);
    }
}
