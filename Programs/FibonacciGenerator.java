import java.util.Scanner;

class FibonacciRunnable implements Runnable {
    private int n;

    public FibonacciRunnable(int n) {
        this.n = n;
    }
    public void run() {
        if (n < 0) {
            System.out.println("Input cannot be negative.");
            return;
        }
        if (n == 0) {
            System.out.println("No numbers to display.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
}

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        String input = scanner.nextLine();

        try {
            int n = Integer.parseInt(input);
            Runnable fibonacciTask = new FibonacciRunnable(n);
            Thread thread = new Thread(fibonacciTask);
            thread.start();
            thread.join();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
