package Oops.Static;
class Test{
    static int x=20;
    int y=3;
    public void show(){
        System.out.println(x+" from non static method "+y);
    }
    public static  void meth(){
        System.out.println("from static meth "+x);
    }
}

public class pro1 {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.meth();
        t.x=50;
        Test.meth();
    }
}
