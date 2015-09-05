import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        String result = reverseString(message);
        System.out.println(result);

    }

    private static String reverseString(String message) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = message.length()-1; i >= 0; i--) {
            reversedStr.append(message.charAt(i));
        }
        return reversedStr.toString();
    }
}
