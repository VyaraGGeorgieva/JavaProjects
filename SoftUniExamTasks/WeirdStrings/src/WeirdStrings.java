import java.util.Scanner;
public class WeirdStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        inputString = inputString.replaceAll("[\\/\\|\\(\\)\\s]+", "");
        String[]words = inputString.split("[^a-zA-Z]+");

        int maxWeight = 0;
        String [] twoWords = new String[2];

        for (int i = 0; i <words.length-1 ; i++) {
            String currentPair = (words[i]+words[i+1]).toLowerCase();

            int currentPairWeight = 0;
            for (int j = 0; j < currentPair.length(); j++) {
               currentPairWeight += currentPair.charAt(j) - ('a'-1);

                if (currentPairWeight>maxWeight){
                    maxWeight = currentPairWeight;
                    twoWords[0] = words[i];
                    twoWords[1] = words[i+1];
                }
            }
        }
        for (String word : twoWords){
            System.out.println(word);
        }
    }
}
