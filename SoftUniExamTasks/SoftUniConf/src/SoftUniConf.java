import java.util.Scanner;
public class SoftUniConf {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine().trim());
        int length = Integer.parseInt(scanner.nextLine().trim());

        //vars to keep the quantities
        int numberOfBeds = 0;
        int numberOfmeals = 0;

        for (int i = 0; i < length; i++) {
            String inputLines = scanner.nextLine();
            String [] arrayInput = inputLines.trim().split("\\s+");
            String commodity = arrayInput[0];
            int quantity = Integer.parseInt(arrayInput[1]);
            String type = arrayInput[2];

            if (commodity.equals("tents")){
                if(type.equals("normal")){
                    numberOfBeds += quantity*2;
                }
                else{
                    numberOfBeds+=quantity*3;
                }
            }

            else if (commodity.equals("rooms")){
                if (type.equals("single")){
                    numberOfBeds+=quantity;
                }
                else if (type.equals("double")){
                    numberOfBeds+=quantity*2;
                }
                else{
                    numberOfBeds+=quantity*3;
                }
            }

            else{
                if(type.equals("musaka")){
                    numberOfmeals+=quantity*2;
                }
            }
        }

        int bedsLeft = numberOfPeople - numberOfBeds;
        if(bedsLeft<0){
            bedsLeft*=-1;
        }
        if (numberOfPeople<=numberOfBeds){
            System.out.println("Everyone is happy and sleeping well. Beds left: " + bedsLeft );
        }
        else{
            System.out.println("Some people are freezing cold. Beds needed: " + bedsLeft);
        }

        int mealsLeft = numberOfPeople - numberOfmeals;
        if(mealsLeft<0){
            mealsLeft*= -1;
        }
        if (numberOfPeople<=numberOfmeals){
            System.out.println("Nobody left hungry. Meals left: "+ mealsLeft);
        }
        else{
            System.out.println("People are starving. Meals needed: "+ mealsLeft);
        }
    }
}
