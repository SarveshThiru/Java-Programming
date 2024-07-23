import java.util.Scanner;
final  class AddNumbers {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        final int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        final int number2 = scanner.nextInt();
        final int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
        scanner.close();
    }
}
