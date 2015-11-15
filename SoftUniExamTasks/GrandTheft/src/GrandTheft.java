import java.util.Scanner;

public class GrandTheft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberAttempts = scanner.nextInt();
        scanner.nextLine();

        long thievesExcaped = 0;
        long thievesSlammed = 0;
        long beersDrunk = 0;

        for (int i = 0; i < numberAttempts ; i++) {
            int thieves  = scanner.nextInt();
            scanner.nextLine();
            int beers = scanner.nextInt();
            scanner.nextLine();

            if(thieves>5){
                thievesExcaped += thieves - 5;
                beersDrunk+=beers;
                thievesSlammed += 5;
            }
            else{
                thievesSlammed += thieves;
                beersDrunk += beers;
            }
        }

        System.out.println(thievesSlammed + " thieves slapped.");
        System.out.println(thievesExcaped + " thieves escaped.");
        System.out.println(beersDrunk/6 + " packs, " + beersDrunk%6 + " bottles.");

    }
}
