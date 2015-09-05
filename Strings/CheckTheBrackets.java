import java.util.Scanner;

//Check if the brackets are correctly put in a given arithmetical expression
public class CheckTheBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        int rightBrackets = 0;
        int leftBrackets = 0;
        boolean isCorrectExpression;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '('){
                rightBrackets++;
            }
            if (expression.charAt(i) == ')'){
                leftBrackets++;
            }
        }
        if (rightBrackets == leftBrackets){
            isCorrectExpression = true;
        }
        else
            isCorrectExpression = false;
        System.out.println(isCorrectExpression);

    }
}
