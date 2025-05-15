package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> myqueue=new LinkedList<>();
		//different types of queues in Java using standard classes/interfaces LinkedList, PriorityQueue, ConcurrentLinkedQueue, ArrayBlockingQueue, ArrayDeque, etc
		myqueue.offer("tanzanite");
		myqueue.offer("alexandrite");
		myqueue.offer("emerald");
		myqueue.offer("sapphire");
		myqueue.offer("ruby");
		myqueue.offer("diamond");
		System.out.println("Queue after enqueue: "+myqueue);
		System.out.println("Front element is: " + myqueue.peek());
        String removed = myqueue.poll();// Dequeue elements
        System.out.println("Dequeued element: " + removed);
        System.out.println("Queue after dequeue: " + myqueue);
        System.out.println("Queue size is: " + myqueue.size());
        // Dequeue remaining elements
        while (!myqueue.isEmpty()) {
            myqueue.poll();
        }
        System.out.println("Queue after removing all elements: " + myqueue);
        System.out.println("Is queue empty now? " + myqueue.isEmpty());
	}

}
/*Output
Queue after enqueue: [tanzanite, alexandrite, emerald, sapphire, ruby, diamond]
Front element is: tanzanite
Dequeued element: tanzanite
Queue after dequeue: [alexandrite, emerald, sapphire, ruby, diamond]
Queue size is: 5
Queue after removing all elements: []
Is queue empty now? true
*/
