import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExamples {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. add(E e) – Inserts the specified element into this priority queue.
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(1);
        System.out.println("PriorityQueue after add(): " + pq);

        // 2. offer(E e) – Inserts element, returns false if fails.
        pq.offer(20);
        System.out.println("After offer(20): " + pq);

        // 3. peek() – Retrieves the head without removing it, returns null if empty
        System.out.println("peek(): " + pq.peek());

        // 4. element() – Retrieves the head, throws exception if empty
        System.out.println("element(): " + pq.element());

        // 5. poll() – Retrieves and removes head, returns null if empty
        System.out.println("poll(): " + pq.poll());
        System.out.println("After poll(): " + pq);

        // 6. remove() – Removes the head, throws exception if empty
        System.out.println("remove(): " + pq.remove());
        System.out.println("After remove(): " + pq);

        // 7. contains(Object o) – Checks if queue contains element
        System.out.println("Contains 15? " + pq.contains(15));

        // 8. size()
        System.out.println("Size of queue: " + pq.size());

        // 9. isEmpty()
        System.out.println("Is queue empty? " + pq.isEmpty());

 ///ArrayDeque
        
        
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 1. addFirst(E e)
        deque.addFirst("A");
        
        // 2. addLast(E e)
        deque.addLast("B");

        // 3. offerFirst(E e)
        deque.offerFirst("Start");

        // 4. offerLast(E e)
        deque.offerLast("End");

        // 5. getFirst()
        System.out.println("First Element: " + deque.getFirst());

        // 6. getLast()
        System.out.println("Last Element: " + deque.getLast());

        // 7. peekFirst()
        System.out.println("Peek First: " + deque.peekFirst());

        // 8. peekLast()
        System.out.println("Peek Last: " + deque.peekLast());

        // 9. removeFirst()
        deque.removeFirst();

        // 10. removeLast()
        deque.removeLast();

        // 11. pollFirst()
        deque.pollFirst();

        // 12. pollLast()
        deque.pollLast();

        // 13. push(E e) - same as addFirst()
        deque.push("Push1");

        // 14. pop() - same as removeFirst()
        String popped = deque.pop();
        System.out.println("Popped: " + popped);

        // 15. contains(Object o)
        deque.add("X");
        deque.add("Y");
        System.out.println("Contains 'Y'? " + deque.contains("Y"));

        // 16. isEmpty()
        System.out.println("Is Empty? " + deque.isEmpty());

        // 17. size()
        System.out.println("Size: " + deque.size());

        // 18. clear()
        deque.clear();
        System.out.println("After clear: " + deque);

        // 19. iterator()
        deque.add("One");
        deque.add("Two");
        deque.add("Three");

        System.out.print("Iterating: ");
        for (String val : deque) {
            System.out.print(val + " ");
        
        }
	}
}
	


