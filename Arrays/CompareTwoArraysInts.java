import java.util.Scanner;

public class CompareTwoArraysInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthFirstArr = Integer.parseInt(scanner.nextLine());
        int lengthSecondArr = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[lengthFirstArr];
        int[] secondArr = new int[lengthSecondArr];

        for (int i = 0; i <firstArr.length ; i++) {
            firstArr[i]=scanner.nextInt();
        }
        for (int j = 0; j < secondArr.length; j++) {
            secondArr[j] = scanner.nextInt();
        }
        compareArrays(firstArr,secondArr);
    }

    public static void compareArrays(int[] firstArr, int[] secondArr) {
        boolean areEqual = true;
        if (firstArr != null && secondArr != null){
            if (firstArr.length != secondArr.length)
                areEqual = false;
            else
                for (int i = 0; i < secondArr.length; i++) {
                    if (secondArr[i] != firstArr[i]) {
                        areEqual = false;
                    }
                }
        }
        else{
            areEqual = false;
            System.out.println(areEqual + " -> the two arrays are not equal");
        }
        System.out.println(areEqual + " -> the two arrays are equal");
    }
}
