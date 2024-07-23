import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        String input = scanner.nextLine();

        try {
            int n = Integer.parseInt(input);
            if (n <= 0) {
                System.out.println("The number of elements should be positive.");
                return;
            }

            int[] numbers = new int[n];
            System.out.println("Enter " + n + " numbers:");

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += numbers[i];
            }

            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: You tried to access an element outside of the array bounds.");
        } finally {
            scanner.close();
        }
    }
}
