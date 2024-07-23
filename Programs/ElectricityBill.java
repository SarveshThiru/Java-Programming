import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double billAmount = calculateBill(units);
        System.out.println("Total bill amount: $" + billAmount);
    }
    public static double calculateBill(int units) {
        double bill = 0.0;
        if (units <= 100) {
            bill = units * 1.00;
        } else if (units <= 200) {
            bill = (100 * 1.00) + ((units - 100) * 2.50);
        } else if (units <= 500) {
            bill = (100 * 1.00) + (100 * 2.50) + ((units - 200) * 4.00);
        } else {
            bill = (100 * 1.00) + (100 * 2.50) + (300 * 4.00) + ((units - 500) * 6.00);
        }
        return bill;
    }
}
