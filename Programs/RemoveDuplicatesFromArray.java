import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueElements.contains(arr[i])) {
                uniqueElements.add(arr[i]);
            }
        }
        int[] uniqueArray = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            uniqueArray[i] = uniqueElements.get(i);
        }   
        return uniqueArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("Non-duplicate items:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        scanner.close();
    }
}
