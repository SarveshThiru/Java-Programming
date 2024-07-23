import java.util.Scanner;

class Table extends Thread {
    private int number;

    Table(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Thread " + this.getName() + " is RUNNING");
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName() + ": " + number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + this.getName() + " is TERMINATED");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number for the multiplication table: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number for the multiplication table: ");
        int number2 = scanner.nextInt();
        Table tableOfNumber1 = new Table(number1);
        System.out.println("Thread " + tableOfNumber1.getName() + " is in NEW state");
        Table tableOfNumber2 = new Table(number2);
        System.out.println("Thread " + tableOfNumber2.getName() + " is in NEW state");
        tableOfNumber1.start();
        System.out.println("Thread " + tableOfNumber1.getName() + " is in RUNNABLE state");

        tableOfNumber2.start();
        System.out.println("Thread " + tableOfNumber2.getName() + " is in RUNNABLE state");
        try {
            tableOfNumber1.join();
            tableOfNumber2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have TERMINATED");

        scanner.close();
    }
}
