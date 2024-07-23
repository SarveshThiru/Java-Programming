class base{
    void display(){
        System.out.print("Hello");
    }
}
class child extends base{
    void run(){
        System.out.print(" World");
    }
}
class leaf extends child{
    void show(){
        System.out.print(" !!!");
    }
}
class demo{
    public static void main(String args []){
        leaf obj=new leaf();
        obj.display();
        obj.run();
        obj.show();
    }
}