package collections;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // add, addFirst, addLast
        deque.add("Apple");
        deque.addFirst("Banana");
        deque.addLast("Cherry");
        System.out.println("Deque after add(): " + deque);

        // contains
        System.out.println("Contains 'Banana'? " + deque.contains("Banana"));

        // element, getFirst, getLast
        System.out.println("element(): " + deque.element());
        System.out.println("getFirst(): " + deque.getFirst());
        System.out.println("getLast(): " + deque.getLast());

        // offer, offerFirst, offerLast
        deque.offer("Date");
        deque.offerFirst("Elderberry");
        deque.offerLast("Fig");
        System.out.println("Deque after offer methods: " + deque);

        // peek, peekFirst, peekLast
        System.out.println("peek(): " + deque.peek());
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        // poll, pollFirst, pollLast
        System.out.println("poll(): " + deque.poll());
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("Deque after poll methods: " + deque);

        // pop and push
        deque.push("Grapes");
        System.out.println("Deque after push(): " + deque);
        System.out.println("pop(): " + deque.pop());
        System.out.println("Deque after pop(): " + deque);

        // removeFirst and removeLast
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removeFirst() and removeLast(): " + deque);

        // size
        System.out.println("Size of deque: " + deque.size());
        //ArrayDeque is faster than LinkedList for most deque operations.
    }
}
/*Output
 * Deque after add(): [Banana, Apple, Cherry]
Contains 'Banana'? true
element(): Banana
getFirst(): Banana
getLast(): Cherry
Deque after offer methods: [Elderberry, Banana, Apple, Cherry, Date, Fig]
peek(): Elderberry
peekFirst(): Elderberry
peekLast(): Fig
poll(): Elderberry
pollFirst(): Banana
pollLast(): Fig
Deque after poll methods: [Apple, Cherry, Date]
Deque after push(): [Grapes, Apple, Cherry, Date]
pop(): Grapes
Deque after pop(): [Apple, Cherry, Date]
Deque after removeFirst() and removeLast(): [Cherry]
Size of deque: 1
*/
