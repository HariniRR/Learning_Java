package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        // Create a simple LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // Add entries
        linkedMap.put(1, "Apple");
        linkedMap.put(2, "Banana");
        linkedMap.put(3, "Cherry");
        linkedMap.put(4, "Date");

        System.out.println("Initial Map: " + linkedMap);

        // containsValue(Object value)
        System.out.println("Contains value 'Banana'? " + linkedMap.containsValue("Banana"));

        // get(Object key)
        System.out.println("Get value for key 3: " + linkedMap.get(3));

        // keySet()
        Set<Integer> keys = linkedMap.keySet();
        System.out.println("Keys: " + keys);

        // values()
        Collection<String> values = linkedMap.values();
        System.out.println("Values: " + values);

        // entrySet()
        Set<Map.Entry<Integer, String>> entries = linkedMap.entrySet();
        System.out.println("Entries: " + entries);
    }
}
/*Output
Initial Map: {1=Apple, 2=Banana, 3=Cherry, 4=Date}
Contains value 'Banana'? true
Get value for key 3: Cherry
Keys: [1, 2, 3, 4]
Values: [Apple, Banana, Cherry, Date]
Entries: [1=Apple, 2=Banana, 3=Cherry, 4=Date]
*/