import java.util.Scanner;
class Binary{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        String binary=x.next();
        int decimal=Integer.parseInt(binary,2);
        System.out.println("Decimal: "+ decimal);
        String OctalString=Integer.toOctalString(decimal);
        System.out.println("Octal: "+OctalString);
        x.close();
    }
}