package Collection_Framework.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set; // <--- Import the Set interface

public class pro1 {
    public static void main(String[] args) {
        // 1. Initialization
        Set<Integer> st = new HashSet<>();

        // 2. Adding Elements
        st.add(2);
        st.add(10);
        st.add(5);
        st.add(2); // Duplicate: will be ignored
        st.add(null); // HashSet allows one null element

        System.out.println("Initial HashSet: " + st); // Output order is NOT guaranteed

        // 3. Checking Existence
        System.out.println("Contains 10? " + st.contains(10)); // true

        // 4. Removing Elements
        st.remove(5);
        System.out.println("After removing 5: " + st);

        // 5. Size and Emptiness
        System.out.println("Size of HashSet: " + st.size());
        System.out.println("Is the HashSet empty? " + st.isEmpty());

        // 6. Iteration (using enhanced for loop)
        System.out.print("Elements via iteration: ");
        for (Integer item : st) {
            System.out.print(item + " ");
        }
        System.out.println();
        Set<Integer> nset=new HashSet<>();
        nset.add(2);
        nset.add(50);
        nset.add(100);
        System.out.println("ratain all method:");
        System.out.println("before retain: old "+st);
        st.retainAll(nset);
        System.out.println("nwe "+nset);
        System.out.println("old "+st);


        // 7. Clearing
        st.clear();
        System.out.println("Size after clear(): " + st.size());


        //LinkedHashset
        Set<Integer> lset=new LinkedHashSet<>();
        lset.add(0);
        lset.add(4);
        lset.add(2);
        System.out.println("insertion oreder maintain linkedhashet: "+lset);
    }
}