import java.util.Scanner;

public class VideoDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumHours = 0;
        int sumMinutes = 0;
        while(true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            String [] elements = input.split(":");
            int hours = Integer.parseInt(elements[0]);
            int minutes = Integer.parseInt(elements[1]);
            sumMinutes = sumMinutes+minutes+hours*60;
        }
        sumHours = sumMinutes/60;
        int minutes = sumMinutes%60;
        System.out.printf("%d:%02d", sumHours, minutes);
    }
}
