import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float principal = scanner.nextFloat();
        System.out.print("Enter the time in years: ");
        float time = scanner.nextFloat();
        System.out.print("Are you a senior citizen (yes/no)? ");
        String isSenior = scanner.next();
        float rateOfInterest;
        if (isSenior.equalsIgnoreCase("yes")) {
            rateOfInterest = 12.0f;
        } else {
            rateOfInterest = 10.0f;
        }
        float simpleInterest = (principal * rateOfInterest * time) / 100;
        System.out.println("Simple interest: " + simpleInterest);
        scanner.close();
    }
}
