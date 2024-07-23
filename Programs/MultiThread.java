public class MultiThread {
    public static void main(String[] args) {
        Thread fibonacci = new Thread(new FibonacciTask());
        Thread reverseOrder = new Thread(new ReverseOrderTask());
        fibonacci.start();
        reverseOrder.start();
    }
}
class FibonacciTask implements Runnable {
    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.println("Fibonacci Series:");
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 10; i++) { 
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
class ReverseOrderTask implements Runnable {
    public void run() {
        System.out.println("Numbers from 20 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
