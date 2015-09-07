//Extract all emails from an entered text, matching the pattern: <sender>@<host>…<domain>

package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static final String emailPattern = "([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher match = pattern.matcher(text);
        while(match.find()){
            String foundEmail = match.group();
            System.out.println(foundEmail);
        }

    }
}
