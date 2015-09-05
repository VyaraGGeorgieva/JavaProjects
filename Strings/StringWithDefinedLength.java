//Write a programme which enters a string of exactly 20 characters. If the string consists of less, append * to the end

import java.util.Scanner;

public class StringWithDefinedLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int stringLength = input.length();
        if (stringLength==20){
            System.out.println(input);
        }
        if (stringLength>20){
            String substring = input.substring(0,20);
            System.out.println("The string is too long, must be not more than 20 chars! The substring of your string is: ");
            System.out.println();
            System.out.println("*" + substring + "*");
        }
        if (stringLength<20) {
            StringBuilder sb = new StringBuilder(stringLength);
            for (int i = 1+stringLength; i <= 20; i++) {
                sb.append('*');
            }
            String stringWithAsterisks = sb.toString();
            System.out.println(input.concat(stringWithAsterisks));

    }
    }
}
