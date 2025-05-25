package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> navSet = new TreeSet<>();

        // add elements
        navSet.add(10);
        navSet.add(20);
        navSet.add(30);
        navSet.add(40);
        navSet.add(50);

        System.out.println("Original Set: " + navSet);

        // lower(E): element less than given
        System.out.println("Lower than 30: " + navSet.lower(30)); // 20

        // floor(E): element less than or equal to given
        System.out.println("Floor of 30: " + navSet.floor(30)); // 30

        // ceiling(E): element greater than or equal to given
        System.out.println("Ceiling of 30: " + navSet.ceiling(30)); // 30

        // higher(E): element greater than given
        System.out.println("Higher than 30: " + navSet.higher(30)); // 40

        // pollFirst() and pollLast()
        System.out.println("pollFirst(): " + navSet.pollFirst()); // 10
        System.out.println("pollLast(): " + navSet.pollLast());   // 50
        System.out.println("Set after poll operations: " + navSet); // [20, 30, 40]

        // descendingSet()
        NavigableSet<Integer> descending = navSet.descendingSet();
        System.out.println("Descending set: " + descending); // [40, 30, 20]

        // subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        NavigableSet<Integer> subSet = navSet.subSet(20, true, 40, false);
        System.out.println("Subset from 20 (inclusive) to 40 (exclusive): " + subSet); // [20, 30]

        // headSet(E toElement, boolean inclusive)
        NavigableSet<Integer> headSet = navSet.headSet(30, true);
        System.out.println("HeadSet to 30 inclusive: " + headSet); // [20, 30]

        // tailSet(E fromElement, boolean inclusive)
        NavigableSet<Integer> tailSet = navSet.tailSet(30, false);
        System.out.println("TailSet from 30 exclusive: " + tailSet); // [40]

        // contains()
        System.out.println("Contains 30? " + navSet.contains(30)); // true

        // size and isEmpty
        System.out.println("Size of set: " + navSet.size());
        System.out.println("Is set empty? " + navSet.isEmpty());
    }
}
/*Output
 * Original Set: [10, 20, 30, 40, 50]
Lower than 30: 20
Floor of 30: 30
Ceiling of 30: 30
Higher than 30: 40
pollFirst(): 10
pollLast(): 50
Set after poll operations: [20, 30, 40]
Descending set: [40, 30, 20]
Subset from 20 (inclusive) to 40 (exclusive): [20, 30]
HeadSet to 30 inclusive: [20, 30]
TailSet from 30 exclusive: [40]
Contains 30? true
Size of set: 3
Is set empty? false
*/
