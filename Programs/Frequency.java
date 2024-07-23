import java.util.*;

public class Frequency {
    public static void main(String args[]) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        HashMap<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println(frequency);
    }
}
