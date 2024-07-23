import java.util.*;
class Factorial{
    public static void main(String args[]){
        int Factorial = 1;
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a=x.nextInt();
        for(int i=1;i<=a;i++){
            Factorial=Factorial*i;
        }
        System.out.println("The Factorial Of "+a+" is "+Factorial);
    }
}