package collections;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree=new TreeSet<>();
		tree.add("Rabbit");
		tree.add("Deer");
		tree.add("Sheep");
		tree.add("Goat");
		tree.add("Cow");
		tree.add("Giraffe");
		System.out.println(tree);//Added and displayed in ascending order with uniqueness properties
		TreeSet<String> trees=new TreeSet<>();
		trees.add("Zebra");
		trees.add("Rhino");
		tree.addAll(trees);
		System.out.println(tree);//.clone() is also available
		System.out.println(tree.contains("Cow"));
		System.out.println(tree.contains("Buffalo"));
		System.out.println(tree.descendingSet());
		System.out.println(tree.first());//the first (lowest) element currently in this set
		// getFirst(), pollFirst(), removeFirst(), addFirst()
		System.out.println(tree.last());//the last (highest) element currently in this set
		System.out.println(tree.getFirst());
		System.out.println(tree.pollFirst());//the first element, or null if this set is empty
		System.out.println(tree.getFirst());//the retrieved element
		tree.clear();
		System.out.println(tree.isEmpty());
	}

}
/*Output
[Cow, Deer, Giraffe, Goat, Rabbit, Rhino, Sheep, Zebra]
true
false
[Zebra, Sheep, Rhino, Rabbit, Goat, Giraffe, Deer, Cow]
Cow
Zebra
Cow
Cow
Deer
true
*/