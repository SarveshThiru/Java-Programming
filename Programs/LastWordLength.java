import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            int length = lengthOfLastWord(input);
            System.out.println("Length of the last word: " + length);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Input string must contain at least one word.");
        }
        String[] words = s.split("\\s+");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}
