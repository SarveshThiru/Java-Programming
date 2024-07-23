import java.util.Scanner;

public class PrimeCompositeCounter {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces: ");
        String[] inputArray = scanner.nextLine().split(" ");
        int primeCount = 0, compositeCount = 0;

        for (String s : inputArray) {
            int number = Integer.parseInt(s);
            if (number > 1) {
                if (isPrime(number)) {
                    primeCount++;
                } else {
                    compositeCount++;
                }
            }
        }

        System.out.println("Prime numbers count: " + primeCount);
        System.out.println("Composite numbers count: " + compositeCount);
        scanner.close();
    }
}
