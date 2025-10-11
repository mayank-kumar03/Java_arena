package Collection_Framework.Priority_Queue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class pro1 {
    public static void main(String[] args) {
        // 1. Initialization: PriorityQueue stores elements based on their natural ordering
        // (min-heap by default for Integer/String)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 2. Add Elements: offer() is generally preferred over add() as it doesn't throw an exception
        // if the insertion fails (though for PriorityQueue it usually won't).
        pq.offer(5);
        pq.offer(0);
        pq.offer(100);
        pq.offer(-1);

        // Output all elements to see the initial state (will not be sorted)
        System.out.println("Current PriorityQueue (internal order may vary): " + pq);

        // 3. Top Element: peek() retrieves the head (highest priority element) without removing it.
        System.out.println("Top element in pqueue: " + pq.peek()); // Output: -1 (smallest)

        // 4. Removing Element: poll() retrieves and removes the head (highest priority element).
        System.out.println("Removed element (poll): " + pq.poll()); // Output: -1

        // 5. New Top Element
        System.out.println("New Top element (peek): " + pq.peek()); // Output: 0

        // 6. Iterate and Empty: Demonstrates removing all elements in priority order
        System.out.print("Elements removed in priority order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Output: 0 5 100
        }
        System.out.println("\nIs the PriorityQueue empty? " + pq.isEmpty()); // Output: true
    }
}
// Expected Output:
// Current PriorityQueue (internal order may vary): [-1, 0, 100, 5] (The specific arrangement can change)
// Top element in pqueue: -1
// Removed element (poll): -1
// New Top element (peek): 0
// Elements removed in priority order: 0 5 100
// Is the PriorityQueue empty? true