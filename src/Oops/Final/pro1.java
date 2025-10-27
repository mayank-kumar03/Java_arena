package Oops.Final;
class Test{
    public final void show(){
        System.out.println("final method");
    }
}

public class pro1 {
    public static void main(String[] args) {
        final double PI;
        PI=3.1;
        System.out.println(PI);
        Test t =new Test();
        t.show();
    }
}
