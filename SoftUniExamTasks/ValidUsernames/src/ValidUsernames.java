import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputLine = scanner.nextLine();
        String[] inputArr = inputLine.split("[\\s()/\\\\]+");
        ArrayList<String> validUsernames = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\b[a-zA-Z][\\w_]{2,25}+\\b");
        for (String string : inputArr){
            Matcher matcher = pattern.matcher(string);
            if(matcher.find()){
                validUsernames.add(string);
            }
        }

        int maxLength = 0;
        String [] longestUsernames = new String[2];
        for (int i = 0; i < validUsernames.size()-1; i++) {
            int currentLength = validUsernames.get(i).length() +
                                validUsernames.get(i+1).length();
            if (currentLength>maxLength){
                maxLength = currentLength;
                longestUsernames[0] = validUsernames.get(i);
                longestUsernames[1] = validUsernames.get(i+1);
            }
        }

        for (String usernaName : longestUsernames){
            System.out.println(usernaName);
        }

    }
}
