// example: aaaaabbbbbcdddeeeedssaa"  "abcdedsa"

import java.util.Scanner;

public class ReplaceRepeatingLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char letter = text.charAt(0);
        StringBuilder newText = new StringBuilder();
        newText.append(letter);

        for (int i = 0; i < text.length() ; i++) {
            if (letter == text.charAt(i)){
                continue;
            }
            else{
                newText.append(text.charAt(i));
                letter = text.charAt(i);
            }
        }
        newText.toString();
        System.out.println(newText);
    }

}
