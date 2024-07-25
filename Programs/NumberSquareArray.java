import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSquareArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();
        scanner.close();

        List<int[]> result = createNumberSquareArray(lowerRange, upperRange);

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            int[] tuple = result.get(i);
            System.out.print("(" + tuple[0] + ", " + tuple[1] + ")");
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static List<int[]> createNumberSquareArray(int lowerRange, int upperRange) {
        List<int[]> numberSquareList = new ArrayList<>();

        for (int i = lowerRange; i <= upperRange; i++) {
            int[] tuple = new int[2];
            tuple[0] = i;
            tuple[1] = i * i;
            numberSquareList.add(tuple);
        }

        return numberSquareList;
    }
}
