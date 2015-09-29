import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bombs {
    public static final String bombMatcher = "([\\|](.*?)[\\|])";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        Pattern pattern = Pattern.compile(bombMatcher);
        Matcher match = pattern.matcher(inputLine);
        while(match.find()){
            String foundBombs = match.group(1);
            int bombSize = 0;
            for (int i = 1; i <foundBombs.length()-1 ; i++) {
                bombSize+=foundBombs.charAt(i);
            }
            bombSize%=10;

            String regex =
                    ".{0," + bombSize +
                            "}\\|(.*?)\\|.{0," +
                            bombSize + "}";
            Pattern bombAreaPat = Pattern.compile(regex);
            Matcher bombAreaMatch = bombAreaPat.matcher(inputLine);
            System.out.println(regex);
            boolean foundArea = bombAreaMatch.find();
            if (foundArea) {
                String area = bombAreaMatch.group();
                String dots = area.replaceAll(".", "\\.");

                inputLine = inputLine.replace(area, dots);
            }
        }
        System.out.println(inputLine);
    }
}
