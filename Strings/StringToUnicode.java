import java.util.Scanner;

public class StringToUnicode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arrayCharacters = input.toCharArray();
        for (int i = 0; i <arrayCharacters.length ; i++) {
            int charValue = arrayCharacters[i];
            String unicode = String.format("\\u%04x", charValue);
            System.out.print(unicode);
        }
    }
}
