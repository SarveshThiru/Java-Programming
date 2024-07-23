class SuperClass {
    int value;

    SuperClass(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("SuperClass value: " + value);
    }
}

class SubClass extends SuperClass {
    int value;

    SubClass(int superValue, int subValue) {
        super(superValue); // Call to superclass constructor
        this.value = subValue;
    }

    void display() {
        System.out.println("SubClass value: " + value);
        System.out.println("SuperClass value from SubClass: " + super.value);
    }
}

public class Super {
    public static void main(String[] args) {
        SubClass subClass = new SubClass(100, 200);
        subClass.display();
    }
}
