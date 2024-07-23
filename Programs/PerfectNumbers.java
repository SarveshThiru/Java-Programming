import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the first n perfect numbers: ");
        int n = scanner.nextInt();
        int count = 0;
        int num = 1;
        while (count < n) {
            if (isPerfectNumber(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        scanner.close();
    }
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
