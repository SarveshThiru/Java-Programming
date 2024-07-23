class string1{
    public static void main(String args[]){
        String a =new String("Java Program");
        String b =new String("Java");
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.concat(" "+b));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.startsWith(b));
        System.out.println(a.endsWith("Program"));
        System.out.println(a.substring(3));

    }
}