import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquaresWithDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();
        scanner.close();

        List<Integer> result = findPerfectSquares(lowerRange, upperRange);
        System.out.println(result);
    }

    private static List<Integer> findPerfectSquares(int lowerRange, int upperRange) {
        List<Integer> perfectSquares = new ArrayList<>();
        
        int start = (int) Math.ceil(Math.sqrt(lowerRange));
        int end = (int) Math.floor(Math.sqrt(upperRange));
        
        for (int i = start; i <= end; i++) {
            int square = i * i;
            if (square >= lowerRange && square <= upperRange && sumOfDigits(square) < 10) {
                perfectSquares.add(square);
            }
        }
        
        return perfectSquares;
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
