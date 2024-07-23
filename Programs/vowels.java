import java.util.*;
class vowels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String a = sc.next();
        int vowelCount = counVowels(a);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels ="aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.inexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}