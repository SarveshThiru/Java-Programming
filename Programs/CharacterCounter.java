import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int numberCount = 0;
        
        System.out.println("Enter * to exit...");
        
        while (true) {
            System.out.print("Enter any character: ");
            char ch = input.next().charAt(0);
            
            if (ch == '*') {
                break;
            }
            
            if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        
        System.out.println("Total count of lower case: " + lowerCaseCount);
        System.out.println("Total count of upper case: " + upperCaseCount);
        System.out.println("Total count of numbers: " + numberCount);
        
        input.close();
    }
}
