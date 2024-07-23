import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = x.nextInt();
        double squareRoot = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is: " + (int)squareRoot);
    }

    public static double calculateSquareRoot(int number) {
        return Math.sqrt(number);
    }
}
