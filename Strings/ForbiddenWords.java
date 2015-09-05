//You are given a short text and a list of forbidden words (separated by a ','). Print the text, replacing the words with '*' (up to the length of the word replaced)

import java.util.Scanner;
public class ForbiddenWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String []forbiddenWords = scanner.nextLine().split(",");

        String[] asterisks = new String[forbiddenWords.length];

        for (int i = 0; i <forbiddenWords.length ; i++) {
            StringBuilder sb = new StringBuilder(forbiddenWords[i].length());
            for (int p = 0; p < forbiddenWords[i].length(); p++) {
                sb.append('*');
            }
            asterisks[i]= sb.toString();
        }
        for (int i = 0; i < forbiddenWords.length; i++) {
            text = text.replace(forbiddenWords[i], asterisks[i]);
        }
        System.out.println(text);

    }
}
