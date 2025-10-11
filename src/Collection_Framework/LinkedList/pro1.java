package Collection_Framework.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

public class pro1 {
    public static void main(String[] args) {

        // 1. Declaration and Initialization
        // LinkedList implements List, Queue, and Deque, making it versatile.
        // We use the concrete class LinkedList when needing its specific methods (addFirst/removeLast).
        LinkedList<String> studentList = new LinkedList<>();
        System.out.println("1. Initial List (Empty): " + studentList);

        // --------------------------------------------------

        // 2. Adding Elements - List & Queue Methods (add, offer)

        // add(element): Appends to the end (List method)
        studentList.add("Alex");
        studentList.add("Bella");
        studentList.add("Caleb");
        System.out.println("\n2. After adding elements (add()): " + studentList);

        // add(index, element): Inserts at a specific position
        studentList.add(1, "Diana");
        System.out.println("   After adding 'Diana' at index 1: " + studentList); // [Alex, Diana, Bella, Caleb]

        // offer(element): Adds to the tail (Queue method - equivalent to add())
        studentList.offer("Ethan");
        System.out.println("   After adding 'Ethan' (offer()): " + studentList); // [Alex, Diana, Bella, Caleb, Ethan]

        // --------------------------------------------------

        // 3. LinkedList/Deque Specific Addition Methods (addFirst, addLast)

        // addFirst(element): Adds to the beginning (most efficient insertion)
        studentList.addFirst("Fred");
        System.out.println("\n3. After adding 'Fred' (addFirst()): " + studentList); // [Fred, Alex, Diana, Bella, Caleb, Ethan]

        // addLast(element): Adds to the end (efficient insertion)
        studentList.addLast("Grace");
        System.out.println("   After adding 'Grace' (addLast()): " + studentList); // [Fred, Alex, Diana, Bella, Caleb, Ethan, Grace]

        // --------------------------------------------------

        // 4. Accessing Elements (get, peek, element)

        // get(index): Retrieves by position (O(n) - slow for large lists)
        String thirdStudent = studentList.get(2);
        System.out.println("\n4. Element at index 2 (get()): " + thirdStudent); // Diana

        // getFirst()/getLast(): Retrieves first/last element (O(1) - fast)
        String firstStudent = studentList.getFirst();
        System.out.println("   First element (getFirst()): " + firstStudent); // Fred

        // peek(): Retrieves, but doesn't remove, the head. Returns null if empty.
        System.out.println("   Head element (peek()): " + studentList.peek()); // Fred

        // element(): Retrieves, but doesn't remove, the head. Throws exception if empty.
        System.out.println("   Head element (element()): " + studentList.element()); // Fred

        // --------------------------------------------------

        // 5. Removing Elements (remove, poll)

        // remove(index): Removes by position
        studentList.remove(3); // Removes 'Bella'
        System.out.println("\n5. After removing index 3 ('Bella'): " + studentList);
        // [Fred, Alex, Diana, Caleb, Ethan, Grace]

        // removeFirst()/removeLast(): Removes from ends (O(1) - efficient deletion)
        studentList.removeFirst(); // Removes 'Fred'
        studentList.removeLast();  // Removes 'Grace'
        System.out.println("   After removing First and Last: " + studentList); // [Alex, Diana, Caleb, Ethan]

        // poll(): Retrieves and removes the head (Queue method). Returns null if empty.
        String removedHead = studentList.poll();
        System.out.println("   Removed Head (poll()): " + removedHead); // Alex
        System.out.println("   List after poll(): " + studentList); // [Diana, Caleb, Ethan]

        // --------------------------------------------------

        // 6. Iteration and Sorting

        // Iterating using enhanced for loop (Standard practice)
        System.out.print("\n6. Iterating through the list: ");
        for (String name : studentList) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Sorting (using Collections utility class)
        Collections.sort(studentList);
        System.out.println("   After sorting: " + studentList); // [Caleb, Diana, Ethan]

        // --------------------------------------------------

        // 7. Clearing the List

        // clear(): Removes all elements
        studentList.clear();
        System.out.println("\n7. After clearing the list: " + studentList);
        System.out.println("   Is the list empty? " + studentList.isEmpty()); // true
    }
}

/**
 * --------------------------------------------------
 * NOTES ON LINKEDLIST EFFICIENCY
 * --------------------------------------------------
 * 1. Internal Structure: LinkedList is a **Doubly Linked List**. Each element (node)
 * holds data and pointers to the previous and next nodes.
 * * 2. Efficiency Summary:
 * - **Insertion/Deletion at Ends (addFirst/removeFirst/addLast/removeLast):** * Very fast ($\mathcal{O}(1)$) because it only involves updating the head/tail pointers.
 * - **Insertion/Deletion in Middle:** Slow ($\mathcal{O}(n)$) because the list must be
 * traversed from the start or end to find the insertion point.
 * - **Random Access (get(index)):** Slow ($\mathcal{O}(n)$) because there is no direct
 * access to an index; the list must be traversed element by element.
 * * 3. Primary Use Case:
 * - When the list is primarily used as a **Queue** (First-In, First-Out) or a **Stack** * (Last-In, First-Out), which involve frequent operations at the ends.
 */