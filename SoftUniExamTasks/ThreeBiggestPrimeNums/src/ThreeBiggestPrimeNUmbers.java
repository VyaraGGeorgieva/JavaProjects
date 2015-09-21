import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class ThreeBiggestPrimeNUmbers {
    public static void main(String[] args) {

        // read the string
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        // split the input into array
        String[] lineArray = line.split("[( )]");

        //parse strings to nums and add them to Treeset (keeps unique nums) in reverse order (we need the 3 biggest primes)

        TreeSet<Integer> setOfNumbers = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < lineArray.length; i++) {
            if (!lineArray[i].equals("")){
                int number = Integer.parseInt(lineArray[i]);
                setOfNumbers.add(number);
            }
        }

        //itirate over each num to find the ppime
        int primesCount = 0;
        int primesSum = 0;

        for (Integer possiblePrime: setOfNumbers){
            //stop the programme if
            if (possiblePrime<=1 || primesCount==3){
                break;
            }

            //check if the current num is prime
            boolean isPrime = true;
            for (int i = 2; i < possiblePrime ; i++) {
                if (possiblePrime%i == 0){
                    isPrime = false;
                }
            }

            if (isPrime){
                primesSum+=possiblePrime;
                primesCount++;
            }
        }

        //print
        if (primesCount==3){
            System.out.println(primesSum);
        }
        else
            System.out.println("No");
    }
}
