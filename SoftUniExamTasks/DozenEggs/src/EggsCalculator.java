import java.util.Scanner;

public class EggsCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] stringArr = new String[7];

        int countEggs = 0;

        for (int i = 0; i <stringArr.length ; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            if (tokens[1].equals("dozens")){
                countEggs+=(Integer.parseInt(tokens[0])*12);
            }
            else{
                countEggs+= Integer.parseInt(tokens[0]);
            }
        }
        int numberOfDozens = countEggs/12;
        int numberoFEggs = countEggs%12;

        System.out.println(numberOfDozens + " dozens + " + numberoFEggs + " eggs");

    }
}
