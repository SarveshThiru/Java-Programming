import java.util.*;
class Marks{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a,b,c,d,e;
        double aggregate;
        System.out.print("Enter Mark of Subject 1: ");
        a = x.nextInt();
        System.out.print("Enter Mark of Subject 2: ");
        b = x.nextInt();
        System.out.print("Enter Mark of Subject 3: ");
        c = x.nextInt();
        System.out.print("Enter Mark of Subject 4: ");
        d = x.nextInt();
        System.out.print("Enter Mark of Subject 5: ");
        e = x.nextInt();
        aggregate = (a+b+c+d+e)/5.0;
        if(aggregate>75){
            System.out.println("Distinction !!!");
        }else if(aggregate>=60 && aggregate<75){
            System.out.println("First Class !!");
        }else if(aggregate>=50 && aggregate<60){
            System.out.println("Second Class !");
        }else if(aggregate>=40 && aggregate<50){
            System.out.println("Third Class ");
        }else{
            System.out.println("Fail");
        }
        System.out.println(aggregate);

    }
}