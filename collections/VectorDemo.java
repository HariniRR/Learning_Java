package collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // add() - Adds an element at the end
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // addElement() - Also adds at the end
        vector.addElement("Date");

        // get() - Get element at index
        System.out.println("Element at index 1: " + vector.get(1));

        // set() - Replace element at index
        vector.set(1, "Blueberry");
        System.out.println("After set(): " + vector);

        // remove() - Remove by index or object
        vector.remove(2);  // removes "Cherry"
        System.out.println("After removing index 2: " + vector);

        // removeElement() - Remove specific object
        vector.removeElement("Date");
        System.out.println("After removeElement(\"Date\"): " + vector);

        // size() - Number of elements
        System.out.println("Size: " + vector.size());

        // contains() - Check if element exists
        System.out.println("Contains 'Apple'? " + vector.contains("Apple"));

        // indexOf() - Get index of element
        System.out.println("Index of 'Apple': " + vector.indexOf("Apple"));

        // isEmpty() - Check if vector is empty
        System.out.println("Is empty? " + vector.isEmpty());

        // firstElement() and lastElement()
        vector.add("Elderberry");
        vector.add("Fig");
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        // elementAt()
        System.out.println("Element at index 1: " + vector.elementAt(1));

        // toArray() - Convert to array
        Object[] array = vector.toArray();
        System.out.print("Array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // capacity() - Current capacity of the Vector
        System.out.println("Capacity: " + vector.capacity());

        // clone() - Shallow copy of vector
        @SuppressWarnings("unchecked")
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);

        // clear() - Remove all elements
        vector.clear();
        System.out.println("After clear(), Vector: " + vector);
    }
}

/*Output
Element at index 1: Banana
After set(): [Apple, Blueberry, Cherry, Date]
After removing index 2: [Apple, Blueberry, Date]
After removeElement("Date"): [Apple, Blueberry]
Size: 2
Contains 'Apple'? true
Index of 'Apple': 0
Is empty? false
First Element: Apple
Last Element: Fig
Element at index 1: Blueberry
Array: Apple Blueberry Elderberry Fig 
Capacity: 10
Cloned Vector: [Apple, Blueberry, Elderberry, Fig]
After clear(), Vector: []
*/

