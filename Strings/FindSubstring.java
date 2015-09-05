import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String substr = scanner.nextLine();
        int count = substringCountOfAppearances(text.toLowerCase(), substr.toLowerCase());
        System.out.println(count);
    }

    private static int substringCountOfAppearances(String input, String substr) {

        int count = 0;
        if (input.length() == 0){
                return 0;
            }

        int index = 0;
            while (true){
                index = input.indexOf(substr, index);
                if (index== -1){
                    break;
                }
                else{
                    index++;
                    count++;
                }
            }
        return count;
    }

}
