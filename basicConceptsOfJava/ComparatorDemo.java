package basicConceptsOfJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cat");
        words.add("Elephant");
        words.add("Dog");

        System.out.println("Original list: " + words);

        // Create a Comparator to sort strings by length
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare based on string length
                return Integer.compare(s1.length(), s2.length());
            }
        };

        // Sort the list using the custom Comparator
        Collections.sort(words, lengthComparator);

        System.out.println("Sorted by length: " + words);
    }
}
/*op
Original list: [Apple, Banana, Cat, Elephant, Dog]
Sorted by length: [Cat, Dog, Apple, Banana, Elephant]
*/