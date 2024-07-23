import java.util.Arrays;
import java.util.Scanner;
public class MinMaxSumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of m:");
        int m = scanner.nextInt();
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        Arrays.sort(arr);
        int mthMax = arr[size - m];
        int nthMin = arr[n - 1];
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println("The " + m + "-th maximum number is: " + mthMax);
        System.out.println("The " + n + "-th minimum number is: " + nthMin);
        System.out.println("The sum of the " + m + "-th maximum and " + n + "-th minimum is: " + sum);
        System.out.println("The difference between the " + m + "-th maximum and " + n + "-th minimum is: " + difference);

        scanner.close();
    }
}
