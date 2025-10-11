package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections; // Required for sorting

public class Pro1 {
    public static void main(String[] args) {

        // 1. Declaration and Initialization
        // We use List interface for polymorphic advantage, but initialize with ArrayList
        List<String> fruits = new ArrayList<>();
        System.out.println("1. Initial List: " + fruits);

        // --------------------------------------------------

        // 2. Adding Elements (add())
        // add(element) adds the element to the end of the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("\n2. After adding elements: " + fruits); // Output: [Apple, Banana, Cherry, Date]

        // add(index, element) inserts the element at the specified index
        fruits.add(1, "Grape");
        System.out.println("   After adding 'Grape' at index 1: " + fruits); // Output: [Apple, Grape, Banana, Cherry, Date]

        // --------------------------------------------------

        // 3. Accessing Elements (get())
        // get(index) returns the element at the specified index
        String firstFruit = fruits.get(0);
        System.out.println("\n3. Element at index 0 (first): " + firstFruit); // Output: Apple

        // --------------------------------------------------

        // 4. Modifying Elements (set())
        // set(index, newElement) replaces the element at the specified index
        fruits.set(4, "Fig");
        System.out.println("\n4. After setting index 4 to 'Fig': " + fruits); // Output: [Apple, Grape, Banana, Cherry, Fig]

        // --------------------------------------------------

        // 5. Getting the Size (size())
        // size() returns the number of elements in the list
        int size = fruits.size();
        System.out.println("\n5. Current size of the list: " + size); // Output: 5

        // --------------------------------------------------

        // 6. Checking for an Element (contains())
        // contains(element) returns true if the list contains the element
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("\n6. Does the list contain 'Banana'? " + hasBanana); // Output: true

        // --------------------------------------------------

        // 7. Finding Element Index (indexOf())
        // indexOf(element) returns the index of the first occurrence, or -1 if not found
        int index = fruits.indexOf("Grape");
        System.out.println("\n7. Index of 'Grape': " + index); // Output: 1

        // --------------------------------------------------

        // 8. Removing Elements (remove())
        // remove(index) removes the element at the index (returns the removed element)
        String removedFruit = fruits.remove(2);
        System.out.println("\n8. Removed element at index 2: " + removedFruit); // Output: Banana
        System.out.println("   List after removing by index: " + fruits); // Output: [Apple, Grape, Cherry, Fig]

        // remove(object) removes the first occurrence of the specified element (returns boolean)
        fruits.remove("Apple");
        System.out.println("   List after removing 'Apple' by object: " + fruits); // Output: [Grape, Cherry, Fig]

        // --------------------------------------------------

        // 9. Adding Another Collection (addAll())
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Mango");
        moreFruits.add("Kiwi");

        // addAll(collection) adds all elements from the specified collection to the end
        fruits.addAll(moreFruits);
        System.out.println("\n9. After adding 'moreFruits' collection: " + fruits); // Output: [Grape, Cherry, Fig, Mango, Kiwi]

        // --------------------------------------------------

        // 10. Sorting the List (Collections.sort())
        // ArrayList does not have its own sort method, we use the static Collections.sort()
        Collections.sort(fruits);
        System.out.println("\n10. After sorting the list: " + fruits); // Output: [Cherry, Fig, Grape, Kiwi, Mango]

        // --------------------------------------------------

        // 11. Removing a Collection (removeAll())
        List<String> fruitsToRemove = new ArrayList<>();
        fruitsToRemove.add("Grape");
        fruitsToRemove.add("Kiwi");

        // removeAll(collection) removes all elements present in the specified collection
        fruits.removeAll(fruitsToRemove);
        System.out.println("\n11. After removing 'Grape' and 'Kiwi': " + fruits); // Output: [Cherry, Fig, Mango]

        // --------------------------------------------------

        // 12. Checking if Empty (isEmpty())
        // isEmpty() returns true if the list contains no elements
        System.out.println("\n12. Is the list empty? " + fruits.isEmpty()); // Output: false

        // --------------------------------------------------

        // 13. Clearing the List (clear())
        // clear() removes all elements from the list
        fruits.clear();
        System.out.println("\n13. After clearing the list: " + fruits); // Output: []

        // Check emptiness again
        System.out.println("    Is the list empty now? " + fruits.isEmpty()); // Output: true

        // --------------------------------------------------

        // 14. Retain All (retainAll()) - Optional/Advanced
        List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30, 40));
        List<Integer> list2 = new ArrayList<>(List.of(20, 40, 50, 60));

        // retainAll(collection) retains only the elements in this list that are contained in the specified collection
        list1.retainAll(list2);
        System.out.println("\n14. RetainAll (Common elements only): " + list1); // Output: [20, 40]

        // --------------------------------------------------

        // 15. Converting to Array (toArray())
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("\n15. Converting to Array (Size: " + fruitArray.length + ")"); // Output: 0 (since fruits was cleared)
    }
}