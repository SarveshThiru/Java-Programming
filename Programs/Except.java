class Except{
    public static void main(String args[]){
        int a=10;
        int b=0;
        try {
            int c=a/b;
        } catch (Exception e) {
            System.out.print("Dividing By Zero is Not Possible");
        }
    }
}