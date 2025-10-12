package Collection_Framework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class pro1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"ravi");
        map.put(5,"ram");
        map.put(8,"rohan");
        map.put(9,"rajkumar");

        System.out.println("Printing Map values: ");
        for(Map.Entry<Integer,String>m:map.entrySet()){

            System.out.println(m.getKey()+"  "+m.getValue());
        }

    }
}
