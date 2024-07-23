import java.util.*;
class SimpleInterest{
    public static void main(String args[]){
        int p,t,r,a,s;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter amount: ");
        p = x.nextInt();
        System.out.print("Enter tenure: ");
        t = x.nextInt();
        System.out.print("Is Senior Citizen(y/n): ");
        a = x.next();
        if(a.equalsIgnoreCase("y")){
            r=12;
        }else{
            r=10;
        }
        s=(p*t*r)/100;
        System.out.println("Simple Interest :"+s);
        x.close();
    }
}