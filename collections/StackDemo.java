package collections;
import java.util.Stack;
public class StackDemo {
    // Method to search for an element at a specific position
    static String searchElement(Stack<String> stack, int position) {
        try {
            if (position < 0 || position >= stack.size()) {
                return "Element not found";
            } else {
                return "At position: " + position + " element " + stack.get(position) + " is found";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred";
        }
    }
    // Method to search for the position of an element
    static int searchPosition(Stack<String> stack, String element) {
        int position = stack.search(element);
        if (position == -1) {
            System.out.println("Element not found in the stack.");
        }
        return position;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] arr = {"Panda", "Lion", "Wolf", "Tiger", "Deer"};
        for (String animal : arr) {
            stack.push(animal);
        }
        System.out.println(stack);
        System.out.println(searchElement(stack, 4)); //0 based index
        System.out.println(searchPosition(stack, "Wolf")); 
        System.out.println(stack.peek());
        String y = stack.pop();
        System.out.println("Popped Element: " + y);
        System.out.println("Now the stack will be: " + stack);
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
