package Oops.Abstraction;

abstract class   Shape{
    abstract public double area();
    abstract  public double perimeter();

}
class Circle extends  Shape{
   public int radius;
    public Circle(int r){
        radius =r;

    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 4*3.14*radius;
    }

}
class Reactangle extends  Shape{
    public int length;
    public int breadth;
    public Reactangle(int l,int b){
        length =l;
        breadth=b;

    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }

}

public class pro1 {
    public static void main(String[] args) {
        Shape s1=new Circle(7);
        System.out.println("AREA: "+s1.area());
        System.out.println("PERIMETER: "+s1.perimeter());
        Reactangle re=new Reactangle(4,5);
        System.out.println("AREA of Reactangle: "+re.area());
        System.out.println("PERIMETER of Perimeter: "+re.perimeter());
        
    }

}
