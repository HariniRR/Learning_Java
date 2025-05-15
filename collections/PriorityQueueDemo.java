package collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> myqueue=new PriorityQueue<>();
		myqueue.add("tanzanite");
		myqueue.add("alexandrite");
		myqueue.add("emerald");
		myqueue.add("sapphire");
		myqueue.add("ruby");
		myqueue.add("diamond");//offer()
		System.out.println("Queue after enqueue: "+myqueue);
		System.out.println("Front element is: " + myqueue.peek());
		String removed = myqueue.remove();// Dequeue elements
		System.out.println("Dequeued element: " + removed);
        String polled = myqueue.poll();
        System.out.println("Queue after dequeue: " + myqueue);
        System.out.println("Dequeued element: " + polled);
        System.out.println("Queue after dequeue: " + myqueue);
        System.out.println("Queue size is: " + myqueue.size());
        System.out.println("Is queue empty now? " + myqueue.isEmpty());
	}

}
/*Output
Queue after enqueue: [alexandrite, ruby, diamond, tanzanite, sapphire, emerald]
Front element is: alexandrite
Dequeued element: alexandrite
Queue after dequeue: [emerald, ruby, sapphire, tanzanite]
Dequeued element: diamond
Queue after dequeue: [emerald, ruby, sapphire, tanzanite]
Queue size is: 4
Is queue empty now? false
*/