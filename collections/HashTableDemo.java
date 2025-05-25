package collections;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        hashtable.put(4, "Date");

        // size()
        System.out.println("Size: " + hashtable.size());

        // toString()
        System.out.println("Hashtable: " + hashtable.toString());

        // contains(Object value)
        System.out.println("Contains value 'Banana'? " + hashtable.contains("Banana"));

        // containsKey(Object key)
        System.out.println("Contains key 2? " + hashtable.containsKey(2));

        // containsValue(Object value)
        System.out.println("Contains value 'Cherry'? " + hashtable.containsValue("Cherry"));

        // get(Object key)
        System.out.println("Value at key 3: " + hashtable.get(3));

        // remove(Object key)
        hashtable.remove(4);
        System.out.println("After removing key 4: " + hashtable);

        // isEmpty()
        System.out.println("Is hashtable empty? " + hashtable.isEmpty());

        // keys()
        System.out.print("Keys: ");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // elements()
        System.out.print("Values: ");
        Enumeration<String> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();

        // keySet()
        Set<Integer> keySet = hashtable.keySet();
        System.out.println("Key Set: " + keySet);

        // values()
        Collection<String> values = hashtable.values();
        System.out.println("Values Collection: " + values);

        // entrySet()
        Set<Map.Entry<Integer, String>> entrySet = hashtable.entrySet();
        System.out.println("Entry Set: " + entrySet);

        // hashCode()
        System.out.println("Hash code: " + hashtable.hashCode());

        // clone()
        @SuppressWarnings("unchecked")
        Hashtable<Integer, String> clonedTable = (Hashtable<Integer, String>) hashtable.clone();
        System.out.println("Cloned Hashtable: " + clonedTable);

        // equals(Object o)
        System.out.println("Is cloned equal to original? " + hashtable.equals(clonedTable));

        // clear()
        hashtable.clear();
        System.out.println("After clear(), hashtable: " + hashtable);
    }
}
/*Output
Size: 4
Hashtable: {4=Date, 3=Cherry, 2=Banana, 1=Apple}
Contains value 'Banana'? true
Contains key 2? true
Contains value 'Cherry'? true
Value at key 3: Cherry
After removing key 4: {3=Cherry, 2=Banana, 1=Apple}
Is hashtable empty? false
Keys: 3 2 1 
Values: Cherry Banana Apple 
Key Set: [3, 2, 1]
Values Collection: [Cherry, Banana, Apple]
Entry Set: [3=Cherry, 2=Banana, 1=Apple]
Hash code: -231690116
Cloned Hashtable: {3=Cherry, 2=Banana, 1=Apple}
Is cloned equal to original? true
After clear(), hashtable: {}
*/