import java.util.*;

public class ThreeBiggestRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace("[","");
        input = input.replaceAll("\\s+","");
        String [] rectangles = input.split("\\]");
        ArrayList<Integer> areaRect = new ArrayList<>();

        for(String rectangle : rectangles){
            String[] sides = rectangle.split("x");
            String firstSide = sides[0];
            String secondSide = sides[1];
            int area =Integer.parseInt(firstSide)*Integer.parseInt(secondSide);
            areaRect.add(area);
        }
        
        Comparator comp = Collections.reverseOrder();
        Collections.sort(areaRect, comp);

        List<Integer> areas = areaRect.subList(0, 3);

        int sum = 0;
        for(int area:areas){

             sum+=area;
        }
        System.out.println(sum);
    }
}
