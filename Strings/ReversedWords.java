//Reverse the words of an entered from the Console sentence

import java.util.Scanner;
public class ReversedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splitWords = scanner.nextLine().split ("(?<=[,.])|(?=[,.!?])|\\s+");
        for (int i = splitWords.length-1; i >=0 ; i--) {
            System.out.print(splitWords[i] + " ");
        }

    }
}
