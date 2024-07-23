import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j = 0;
        int n = 0;
        int s1 = 0, s2 = 0;
        System.out.println("Enter -1 to exit...");
        while (true) {
            n = input.nextInt();
            if (n == -1) {
                break;
            }
            if (n > 0) {
                i++;
                s1 += n;
            } else {
                j++;
                s2 += n;
            }
        }
        input.close();
        double pos = i > 0 ? (double) s1 / i : 0;
        double neg = j > 0 ? (double) s2 / j : 0;
        System.out.println("The average of positive numbers: " + pos);
        System.out.println("The average of negative numbers: " + neg);
    }
}
