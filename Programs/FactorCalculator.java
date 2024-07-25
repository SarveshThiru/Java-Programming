import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (number <= 0 || n <= 0) {
            System.out.println("Number and n must be positive integers.");
            scanner.close();
            return;
        }

        List<Integer> factors = findFactors(number);
        int numOfFactors = factors.size();
        
        System.out.println("Number of factors = " + numOfFactors);

        if (n > numOfFactors) {
            System.out.println(n + "th factor does not exist.");
        } else {
            System.out.println(n + "th factor of " + number + " = " + factors.get(n - 1));
        }

        scanner.close();
    }
    public static List<Integer> findFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);
                if (i != number / i) {
                    factors.add(number / i);
                }
            }
        }
        factors.sort(null);
        return factors;
    }
}
