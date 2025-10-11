package Collection_Framework.TreeSet;

import java.util.TreeSet;
import java.util.Set;

public class pro1 {
    public static void main(String[] args) {
        // 1. Initialization (Natural Sorting)
        Set<Integer> ts = new TreeSet<>();

        // 2. Adding Elements - They are automatically sorted.
        ts.add(50);
        ts.add(20);
        ts.add(80);
        ts.add(50); // Duplicate, will be ignored

        System.out.println("TreeSet (Default Natural Order): " + ts); // Output: [20, 50, 80]

        // 3. Navigational Methods (Unique to TreeSet/NavigableSet)
        System.out.println("Element greater than or equal to 50 (ceiling): " + ((TreeSet<Integer>) ts).ceiling(50)); // 50
        System.out.println("Element less than 50 (lower): " + ((TreeSet<Integer>) ts).lower(50)); // 20
        System.out.println("First element (min): " + ((TreeSet<Integer>) ts).first()); // 20
        System.out.println("Last element (max): " + ((TreeSet<Integer>) ts).last()); // 80

        // 4. Using a Custom Comparator (Reverse/Descending Order)
        TreeSet<String> tsDesc = new TreeSet<>((s1, s2) -> s2.compareTo(s1)); // Lambda Comparator
        tsDesc.add("Apple");
        tsDesc.add("Banana");
        tsDesc.add("Carrot");

        System.out.println("TreeSet (Custom Comparator - Descending): " + tsDesc); // Output: [Carrot, Banana, Apple]
    }
}