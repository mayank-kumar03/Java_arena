package Oops.InnerClass;
abstract  class My{
    abstract void display();
}
class OuterAn{
    public void meth(){
        My m=new My(){
            public void display(){
                System.out.println("hello");
            }
        };
        m.display();
    }
}

public class Anonymous {
    public static void main(String[] args) {
        OuterAn oan=new OuterAn();
        oan.meth();
    }


}
