import java.util.Arrays;
import java.util.Scanner;

public class TinySporegat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int startingHealth = 5800;
        int glowCaps = 0;


        while(!(input.equals("Sporeggar"))){
            //keep all the chars in an array
            char[] charArray = input.toCharArray();
            //substract the char value (ascii)
            for (int i = 0; i <charArray.length-1 ; i++) {
                if (charArray[i] == 'L') {
                    startingHealth += 200;
                } else {
                    startingHealth -= (int) charArray[i];
                }
            }
            //initialize another char [] to keep the numbers only
            char[] arrayNums = Arrays.copyOfRange(charArray,charArray.length-1, charArray.length);

            //initialize int [] to keep the numbers as nums
            int[] glowcapsEarned = new int[arrayNums.length];
            //calculate
            for (int i = 0; i <arrayNums.length ; i++) {
                glowcapsEarned[i] = arrayNums[i]- '0';
            }
            for (int i = 0; i <glowcapsEarned.length ; i++) {
                glowCaps+=glowcapsEarned[i];
            }
            input = reader.nextLine();

        }
        if (startingHealth>=0){
            System.out.println("Health left: " + startingHealth);
            if(glowCaps>=30){
                System.out.println("Bought the sporebat. Glowcaps left: " + (glowCaps - 30) );
            }else{
                System.out.println("Safe in Sporeggar, but another "+ (30-glowCaps) +" Glowcaps needed.");
            }
        }else{
            System.out.println("Died. Glowcaps: " + glowCaps);
        }

    }
}
