import java.util.Scanner;

public class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a perfect square number: ");
        int number = scanner.nextInt();
        if (isPerfectSquare(number)) {
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + squareRoot);
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
    private static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number);
    }
}
