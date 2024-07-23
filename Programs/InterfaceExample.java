interface Shape {
    double calculateArea();
    default void display() {
        System.out.println("This is a shape.");
    }
    static void printInfo() {
        System.out.println("Interface Shape: Defines behaviors for shapes.");
    }
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);   
        System.out.println("Area of the circle: " + circle.calculateArea());
        circle.display();
        Shape.printInfo();
    }
}