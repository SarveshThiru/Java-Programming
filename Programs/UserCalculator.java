import java.util.Scanner;

public class UserCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Enter number of staff users: ");
        int staffUsers = scanner.nextInt();

        if (totalUsers < 0 || staffUsers < 0 || staffUsers > totalUsers) {
            System.out.println("Invalid input. Please ensure all numbers are non-negative and staff users do not exceed total users.");
            scanner.close();
            return;
        }

        int nonTeachingStaffUsers = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaffUsers;

        System.out.println("Total Users: " + totalUsers);
        System.out.println("Staff Users: " + staffUsers);
        System.out.println("Non-Teaching Staff Users: " + nonTeachingStaffUsers);
        System.out.println("Student Users: " + studentUsers);

        scanner.close();
    }
}
