import java.util.ArrayList;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divider = scanner.nextInt();
        scanner.nextLine();


        ArrayList<Integer> nums = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }

            nums.add(Integer.parseInt(input));
        }

        long maxSum = Integer.MIN_VALUE;
        int count = 0;
        String result = "";
        for (int i1 = 0; i1 <nums.size() ; i1++) {
            for (int i2 = i1+1; i2 < nums.size(); i2++) {
                for (int i3 = i2+1; i3 < nums.size(); i3++) {
                    long sum = nums.get(i1) + nums.get(i2) + nums.get(i3);
                    if (sum%divider == 0 && sum>maxSum){
                        maxSum = sum;
                        result = String.format("(%d + %d + %d) %% %d = 0",
                                nums.get(i1), nums.get(i2), nums.get(i3), divider);
                        count ++;
                    }
                }
            }
        }
        if (count > 0) {
            System.out.println(result);
        }
        else
            System.out.println("No");
    }
}
