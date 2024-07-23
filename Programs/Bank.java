class Rbank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Rbank {
    double getRateOfInterest() {
        return 8.4;
    }
}
class ICICI extends Rbank {
    double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Rbank {
    double getRateOfInterest() {
        return 9.7;
    }
}
public class Bank {
    public static void main(String[] args) {
        Rbank bank;
        bank = new SBI();
        System.out.println("SBI Rate of Interest: " + bank.getRateOfInterest());
        bank = new ICICI();
        System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest());
        bank = new AXIS();
        System.out.println("AXIS Rate of Interest: " + bank.getRateOfInterest());
    }
}
