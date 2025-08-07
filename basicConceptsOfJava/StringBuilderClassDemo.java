package basicConceptsOfJava;

public class StringBuilderClassDemo {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Java");
        System.out.println("Initial text: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

        sb.replace(5, 16, "is awesome");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length of StringBuilder: " + sb.length());
        System.out.println("Capacity of StringBuilder: " + sb.capacity());
	}

}
/*Output
Initial text: Java
After append: Java Programming
After insert: Java Language Programming
After delete: Java Programming
After replace: Java is awesome
After reverse: emosewa si avaJ
Length of StringBuilder: 15
Capacity of StringBuilder: 42*/