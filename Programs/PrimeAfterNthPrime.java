import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeAfterNthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N must be a positive integer.");
            scanner.close();
            return;
        }

        List<Integer> primes = new ArrayList<>();
        int currentNumber = 2;
        while (primes.size() < n) {
            if (isPrime(currentNumber)) {
                primes.add(currentNumber);
            }
            currentNumber++;
        }

        int nthPrime = primes.get(n - 1);
        System.out.println(n + "th Prime number is " + nthPrime);
        List<Integer> nextPrimes = new ArrayList<>();
        currentNumber = nthPrime + 1;
        
        while (nextPrimes.size() < n) {
            if (isPrime(currentNumber)) {
                nextPrimes.add(currentNumber);
            }
            currentNumber++;
        }

        System.out.println(n + " prime numbers after " + nthPrime + " are: " + nextPrimes);
        scanner.close();
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
