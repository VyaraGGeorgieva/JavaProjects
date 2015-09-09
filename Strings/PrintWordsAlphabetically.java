import java.util.Arrays;
import java.util.Scanner;

public class PrintWordsAlphabetically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().toLowerCase().split(", ");
        Arrays.sort(text);
        for(int i = 0; i < text.length; i++)
            System.out.println(text[i]);
        }
    }
