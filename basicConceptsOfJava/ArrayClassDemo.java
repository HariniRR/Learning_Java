import java.util.Arrays;
public class ArrayClassDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);  // Sort the array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 5);// Search for an element
        System.out.println("Index of 5: " + index); 
        
        int[] newArray = new int[3];
        Arrays.fill(newArray, 7);// Fill an array
        System.out.println("Filled array: " + Arrays.toString(newArray)); 
    }
}

/*Output
 Sorted array: [1, 2, 5, 8, 9]
 Index of 5: 2
 Filled array: [7, 7, 7]
*/

/*The java.util.Arrays Class:
- This is a utility class that provides static methods for manipulating arrays. 
- You don't create an instance of Arrays; you call its static methods directly using Arrays.<methodName>().
- It offers a wide range of functionalities, including:
  Sorting: Arrays.sort() for various data types.
  Searching: Arrays.binarySearch() for sorted arrays.
  Comparing: Arrays.equals() to check if two arrays are equal in content.
  Filling: Arrays.fill() to assign a specific value to all elements or a range of elements.
  Converting to String: Arrays.toString() to get a string representation of an array's contents. 
  Copying: Arrays.copyOf() and Arrays.copyOfRange().*/
