import java.util.Scanner;

public class CartesianSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();


        if (x>0 && y>0){
            System.out.println("1");
        }
        if (x>0 && y<0){
            System.out.println("4");
        }
        if (x<0 && y<0){
            System.out.println("3");
        }
        if (x<0 && y>0){
            System.out.println("2");
        }
        if (x == 0 && (y>0 || y<0)){
            System.out.println("5");
        }
        if ((x>0 || x<0) && y == 0){
            System.out.println("6");
        }
        if  (x == 0 && y==0){
            System.out.println("0");
        }
    }
}
