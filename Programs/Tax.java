import java.util.*;
class Tax{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a;
        System.out.print("Enter your Income: ");
        a = x.nextInt();
        if(a<=150000){
            System.out.println("No Tax");
        }else if(a>=150001 && a<300000){
            System.out.println("Tax: "+a/10);
        }else if(a>=300001 && a<500000){
            System.out.println("Tax: "+a/20);
        }else{
            System.out.println("Tax: "+a/30);
        }
    }
}