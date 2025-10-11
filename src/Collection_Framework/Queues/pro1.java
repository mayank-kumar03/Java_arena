package Collection_Framework.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException; // Important exception for error handling

public class pro1 {
    public static void main(String[] args) {

        // =====================================================================
        // PART 1: Standard Queue Methods (Interview Focus: Offer/Poll vs. Add/Remove)
        // =====================================================================

        // Queue<Integer> q = new LinkedList<>(); // for normal FIFO ordering queue;
        // The implementation class (LinkedList) is used because it supports both Queue and Deque interfaces.

        System.out.println("--- PART 1: Standard Queue Operations (FIFO) ---");

        // 1. Adding Elements
        // ==================

        // Method 1: offer(E element) - Preferred
        // Inserts the element at the tail of the queue. Returns true if successful, false if capacity limit reached (rarely in LinkedList).
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        System.out.println("Queue after offer(): " + q1); // Output: [10, 20, 30]

        // Method 2: add(E element)
        // Inserts the element at the tail. Throws IllegalStateException if capacity limit reached.
        q1.add(40);
        System.out.println("Queue after add(): " + q1); // Output: [10, 20, 30, 40]

        // 2. Inspecting the Head
        // ======================

        // Method 1: peek() - Preferred
        // Retrieves, but does not remove, the head of the queue. Returns 'null' if the queue is empty.
        System.out.println("\nHead element (peek()): " + q1.peek()); // Output: 10

        // Method 2: element()
        // Retrieves, but does not remove, the head. Throws NoSuchElementException if the queue is empty.
        System.out.println("Head element (element()): " + q1.element()); // Output: 10

        // 3. Removing the Head
        // ====================

        // Method 1: poll() - Preferred
        // Retrieves and removes the head. Returns 'null' if the queue is empty (safer for error handling).
        System.out.println("\nRemoved element (poll()): " + q1.poll()); // Output: 10
        System.out.println("Queue after poll(): " + q1); // Output: [20, 30, 40]

        // Method 2: remove()
        // Retrieves and removes the head. Throws NoSuchElementException if the queue is empty.
        System.out.println("Removed element (remove()): " + q1.remove()); // Output: 20
        System.out.println("Queue after remove(): " + q1); // Output: [30, 40]

        // 4. Checking Size/Emptiness
        // ==========================
        System.out.println("\nQueue size: " + q1.size()); // Output: 2
        System.out.println("Is the Queue empty? " + q1.isEmpty()); // Output: false


        // --------------------------------------------------------------------
        // INTERVIEW NOTE: Handling Empty Queue Differences
        // --------------------------------------------------------------------

        System.out.println("\n--- INTERVIEW FOCUS: Error Handling ---");

        Queue<Integer> emptyQ = new LinkedList<>();

        // 1. Comparison of inspection methods on an empty queue
        System.out.println("peek() on empty queue returns: " + emptyQ.peek()); // Returns null (Safe)

        try {
            System.out.println("element() on empty queue throws:");
            emptyQ.element(); // Throws NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("  -> Caught NoSuchElementException (as expected for element())");
        }

        // 2. Comparison of removal methods on an empty queue
        System.out.println("poll() on empty queue returns: " + emptyQ.poll()); // Returns null (Safe)

        try {
            System.out.println("remove() on empty queue throws:");
            emptyQ.remove(); // Throws NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("  -> Caught NoSuchElementException (as expected for remove())");
        }


        // =====================================================================
        // PART 2: Deque/Double-Ended Queue Methods (Less Common, but valuable)
        // =====================================================================

        // Since LinkedList implements Deque, it can act as a stack or double-ended queue.
        System.out.println("\n--- PART 2: Deque Methods (Stack/Double-Ended Queue) ---");
        LinkedList<String> deque = new LinkedList<>();

        // Pushing/Adding to the front (Stack functionality)
        deque.push("First");
        deque.push("Second");
        deque.addFirst("Zero"); // Deque method equivalent to push()
        System.out.println("Deque after pushing: " + deque); // Output: [Zero, Second, First]

        // Adding to the back
        deque.addLast("Last");
        System.out.println("Deque after addLast(): " + deque); // Output: [Zero, Second, First, Last]

        // Popping/Removing from the front (Stack functionality)
        String popped = deque.pop();
        System.out.println("\nRemoved (pop()): " + popped); // Output: Zero
        System.out.println("Deque after pop(): " + deque); // Output: [Second, First, Last]

        // Offer and Poll from ends
        deque.offerFirst("NewHead");
        deque.offerLast("NewTail");
        System.out.println("Deque after offerFirst/offerLast: " + deque); // Output: [NewHead, Second, First, Last, NewTail]

        // Removing the specific element from the back
        String removedTail = deque.pollLast();
        System.out.println("Removed from tail (pollLast()): " + removedTail); // Output: NewTail
        System.out.println("Final Deque: " + deque);
    }
}

/**
 * -----------------------------------------------------------------------------
 * INTERVIEW NOTES: QUEUE INTERFACE METHODS
 * -----------------------------------------------------------------------------
 * * Queue is a FIFO (First-In, First-Out) collection. The methods come in two pairs,
 * differentiated by how they handle failure (capacity constraints or empty queue).
 * This difference is a frequently asked interview question.
 * * -----------------------------------------------------------------------------
 * | FUNCTION | SAFE METHODS (Return Special Value) | EXCEPTION METHODS (Throw Error) |
 * -----------------------------------------------------------------------------
 * | **Insertion** | offer(e) -> Returns true/false | add(e) -> Throws IllegalStateException |
 * | **Retrieval** | peek() -> Returns null if empty | element() -> Throws NoSuchElementException |
 * | **Removal** | poll() -> Returns null if empty | remove() -> Throws NoSuchElementException |
 * -----------------------------------------------------------------------------
 * * * Best Practice:
 * - Always prefer **offer()** for inserting and **poll()** for removing in most queue implementations, as they are safer and avoid unexpected exceptions when the queue is empty or full (especially with bounded queues like ArrayBlockingQueue).
 * * * Deque (Double-Ended Queue):
 * - LinkedList implements the Deque interface, allowing it to function as a Stack (LIFO) or a Queue (FIFO).
 * - Key Deque methods for Stack-like behavior:
 * - **push(e):** Adds to the head (like `addFirst`).
 * - **pop():** Removes from the head (like `removeFirst`).
 * - Key Deque methods for double-ended operations:
 * - **offerFirst(e) / offerLast(e)**
 * - **pollFirst() / pollLast()**
 * -----------------------------------------------------------------------------
 */