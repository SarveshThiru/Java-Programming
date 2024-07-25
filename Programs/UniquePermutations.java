import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Given Number: ");
        String number = scanner.next();
        scanner.close();

        Set<String> permutations = new HashSet<>();
        generatePermutations(number.toCharArray(), 0, permutations);

        System.out.println("Permutations are:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    private static void generatePermutations(char[] arr, int index, Set<String> permutations) {
        if (index == arr.length - 1) {
            permutations.add(new String(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                generatePermutations(arr, index + 1, permutations);
                swap(arr, index, i); // Backtrack
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
