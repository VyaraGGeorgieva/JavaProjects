import java.util.Scanner;

public class FindAllPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] tokens = input.split("[\\s;.,:'!?()->]");
        for(int i = 0; i < tokens.length; i++)
            for (int j = 0; j <tokens[i].length() ; j++) {
                if (tokens[i].equals(getReversed(tokens[i]))){
                    System.out.print(tokens[i] + ", ");
                    break;
                }
            }
    }

    private static String getReversed(String token) {
        StringBuilder reversed = new StringBuilder();
        for (int i = token.length()-1; i >=0 ; i--) {
            reversed.append(token.charAt(i));
        }
        return reversed.toString();
    }
}
