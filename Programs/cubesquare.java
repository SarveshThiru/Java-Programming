import java.util.*;
class cubesquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        float n = sc.nextFloat();
        float cube = n*n*n;
        float sqr = n*n;
        System.out.println("Cube : "+cube);
        System.out.println("Square : "+sqr);
    }
    
}
