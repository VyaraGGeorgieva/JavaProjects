import java.util.Scanner;

public class DetectiveBoev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        String secretWord = scanner.nextLine();
        String message = scanner.nextLine();

        //take the ascii and add them up
        int ascii = 0;
        for (int i = 0; i < secretWord.length(); i++) {
             ascii += secretWord.charAt(i);
        }
         //sum up the digits
        int sumOfDigits = 0;
        while (ascii > 9 ) {
            sumOfDigits=0;
            while (ascii > 0) {
                int rem;
                rem = ascii % 10;
                sumOfDigits = sumOfDigits + rem;
                ascii = ascii / 10;
            }
            ascii = sumOfDigits;
        }
        //loop over the message

        int messageChar = 0;
        for (int i = (message.length())-1; i>=0 ; i--) {
            messageChar = message.charAt(i);
            if(messageChar%sumOfDigits == 0){
                messageChar+=sumOfDigits;
            }
            else{
                messageChar-=sumOfDigits;
            }

            String reversedMessage  = Character.toString(new Character((char) messageChar));
            System.out.print(reversedMessage);

        }
    }


}
