import java.util.Arrays;
import java.util.Comparator;
public class NameSorter {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Eve", "David"};
        Arrays.sort(names);
        System.out.println("Names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
        Arrays.sort(names, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("\nNames in descending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
