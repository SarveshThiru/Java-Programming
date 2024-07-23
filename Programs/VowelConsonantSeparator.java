public class VowelConsonantSeparator {
    public static void main(String[] args) {
        String input = "Hello, World!";
        displayVowelsAndConsonants(input);
    }

    public static void displayVowelsAndConsonants(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder vowelList = new StringBuilder();
        StringBuilder consonantList = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelList.append(ch).append(" ");
                } else {
                    consonantList.append(ch).append(" ");
                }
            }
        }

        System.out.println("Vowels: " + vowelList.toString());
        System.out.println("Consonants: " + consonantList.toString());
    }
}
