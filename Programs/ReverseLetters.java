import java.util.*;

public class ReverseLetters {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = x.next();
        Character[] charArray = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
        }
        Arrays.sort(charArray, Collections.reverseOrder());
        StringBuilder sortedWord = new StringBuilder(charArray.length);
        for (Character c : charArray) {
            sortedWord.append(c);
        }
        System.out.println("Original word: " + word);
        System.out.println("Sorted word in reverse alphabetical order: " + sortedWord.toString());
    }
}
