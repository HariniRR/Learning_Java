package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> foodlist=new LinkedList<String>();
		foodlist.add("Apple");
		foodlist.add("Banana");
		foodlist.add("Cherry");
		foodlist.add("Date");
		foodlist.add("Egg");
		foodlist.add("Fig");
		foodlist.add("Grape");
		System.out.println(foodlist);
		foodlist.addFirst("Honey"); //adding element at first
		System.out.println(foodlist);
		foodlist.addLast("Icecream"); //adding element at last
		System.out.println(foodlist);
		foodlist.removeFirst(); //removing element at first
		System.out.println(foodlist);
		foodlist.removeLast(); //removing element at last
		System.out.println(foodlist);
		System.out.println(foodlist.get(2));
		System.out.println(foodlist.getFirst());
		System.out.println(foodlist.getLast()); //getting 1st and last elements
	}

}
/*Output
[Apple, Banana, Cherry, Date, Egg, Fig, Grape]
[Honey, Apple, Banana, Cherry, Date, Egg, Fig, Grape]
[Honey, Apple, Banana, Cherry, Date, Egg, Fig, Grape, Icecream]
[Apple, Banana, Cherry, Date, Egg, Fig, Grape, Icecream]
[Apple, Banana, Cherry, Date, Egg, Fig, Grape]
Cherry
Apple
Grape
*/