package Oops.InnerClass;

class Outer{
    static int x=10;
    class Inner{
        int y=20;
        public  void innerDisplay(){
            System.out.println(x+" from iner class: "+y);
        }
    }
    public  void outerDisplay(){
        Inner i=new Inner();
        System.out.println(i.y);
    }
}
public class NestedClass {
    public static void main(String[] args) {
        Outer.Inner i=new Outer().new Inner();
        i.innerDisplay();
        Outer o=new Outer();
        o.outerDisplay();

    }
}
