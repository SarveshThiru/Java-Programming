import java.util.*;
class narray{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a[]={23,45,67,87,98,4,56,4};
        int len = a.length;
        Arrays.sort(a);
        int n;
        System.out.println("Ente the Nth Element: ");
        n = x.nextInt();
        System.out.println(n + " Largest Number: " +a[len-n]);
    }
}