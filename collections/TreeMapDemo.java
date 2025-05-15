package collections;
import java.util.TreeMap;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> treemap=new TreeMap<>();
		treemap.put(1, "Winter jasmine");
		treemap.put(2, "Crocus");
		treemap.put(5, "Pansies");
		treemap.put(3,"Primrose");
		treemap.put(4, "Hellebore");
		treemap.put(6, "Snowdrop");//putFirst(), putLast(), natural ordered sorting of keys
		System.out.println(treemap.get(3));
		System.out.println(treemap.containsKey(7));//containsValue()
		System.out.println(treemap.remove(5, "Pansies"));//.remove(object key);
		System.out.println(treemap.values());
		treemap.replace(1, "Camellia");//replace(key, oldvalue, newvalue);
		System.out.println(treemap);
		System.out.println(treemap.descendingKeySet());
		System.out.println(treemap.descendingMap());
		System.out.println(treemap.firstEntry());//an entry with the least key, or null if this map is empty & lastEntry()
		System.out.println(treemap.firstKey());//the first (lowest) key currently in this map & lastKey()
		System.out.println(treemap.floorEntry(3)); //an entry with the greatest key less than or equal to key, or null if there is no such key & floorKey()
		System.out.println(treemap.lowerEntry(3));//an entry with the greatest key less than key, or null if there is no such key & lowerKey()
		System.out.println(treemap.pollFirstEntry());//the removed first entry of this map, or null if this map is empty
		//System.out.println(treemap.pollLastEntry());  the removed last entry of this map, or null if this map is empty
		treemap.clear();//clone();
		System.out.println(treemap.isEmpty());
	}

}
/*Output
Primrose
false
true
[Winter jasmine, Crocus, Primrose, Hellebore, Snowdrop]
{1=Camellia, 2=Crocus, 3=Primrose, 4=Hellebore, 6=Snowdrop}
[6, 4, 3, 2, 1]
{6=Snowdrop, 4=Hellebore, 3=Primrose, 2=Crocus, 1=Camellia}
1=Camellia
1
3=Primrose
2=Crocus
1=Camellia
true
*/