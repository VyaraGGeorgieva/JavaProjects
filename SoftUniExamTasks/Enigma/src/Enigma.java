import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <inputLines ; i++) {
            String messageLine = scanner.nextLine();
            String messageWithoutSpaces = messageLine.replaceAll("\\s+","");
            int halfLength = (messageWithoutSpaces.length())/2;

            for (int j = 0; j <messageLine.length() ; j++) {
                int value = messageLine.charAt(j);
                if (Character.isDigit(value)){
                    System.out.print(value);
                }
                else if(value==' '){
                    System.out.print(" ");
                }
                else{

                    int recalculatedChar = value+halfLength;
                    String word = Character.toString((char)recalculatedChar);
                    System.out.print(word);
                }

            }
            System.out.println();

        }
    }
}
