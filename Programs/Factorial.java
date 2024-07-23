class Factorial{
    public static void main(String[] args) {
        int factorial=1;
        int number=5;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        System.err.println("Factoraial is :"+factorial);
    }
}