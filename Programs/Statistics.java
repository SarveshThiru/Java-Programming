import java.util.Arrays;
public class Statistics {
    public static void main(String[] args) {
        int[] numbers = {16, 18, 27, 16, 23, 21, 19};
        System.out.println("Mean = " + calculateMean(numbers));
        System.out.println("Median = " + calculateMedian(numbers));
        System.out.println("Mode = " + calculateMode(numbers));
    }
    public static double calculateMean(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(Double.NaN);
    }
    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        } else {
            return numbers[middle];
        }
    }
    public static int calculateMode(int[] numbers) {
        int maxValue = 0, maxCount = 0;
        for (int i = 0; i < numbers.length; ++i) {
            int count = 0;
            for (int j = 0; j < numbers.length; ++j) {
                if (numbers[j] == numbers[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
}
