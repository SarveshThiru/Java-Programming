import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();
        int decimalValue = Integer.parseInt(binaryString, 2);
        String octalValue = Integer.toOctalString(decimalValue);
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalValue);
        System.out.println("Octal: " + octalValue);
        
        input.close();
    }
}
