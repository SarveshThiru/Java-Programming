import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = {100, 200, 500, 2000};
        int[] numberOfNotes = new int[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the number of notes for denomination " + denominations[i] + ": ");
            numberOfNotes[i] = scanner.nextInt();
        }
        int totalAmount = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalAmount += denominations[i] * numberOfNotes[i];
        }
        System.out.println("Total Available Balance in ATM: " + totalAmount);
        scanner.close();
    }
}
