package Collection_Framework.TreeSet;

import java.awt.*;
import java.util.Objects;
import java.util.TreeSet;

class Points implements  Comparable<Points>{
    int x;
    int y;
    public   Points(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "x= "+x+" y="+y;
    }
    public int compareTo(Points p){
        if(x<p.x){
            return -1;
        }else if(x>p.x){
            return 1;
        }else{
            if(y<p.y){
                return -1;
            }else if(y>p.y){
                return 1;
            }else{
                return 0;
            }
        }
    }
}

public class Pro2 {
    public static void main(String[] args) {
        TreeSet<Points> ts=new TreeSet<>();
        ts.add(new Points(1,2));
        ts.add(new Points(5,2));
        ts.add(new Points(3,2));
        ts.add(new Points(1,4));
        ts.add(new Points(2,5));

        System.out.println(ts);




    }
}
