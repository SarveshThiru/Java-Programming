import java.util.Scanner;
class Base {
    protected int number1, number2;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();
    }
}
class Derived extends Base {

    public void calculateAndDisplay() {
        int sum = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
public class AddNumbers {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.getInput();
        derived.calculateAndDisplay();
    }
}
