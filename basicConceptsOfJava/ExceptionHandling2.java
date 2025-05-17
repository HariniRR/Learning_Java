package basicConceptsOfJava;
public class ExceptionHandling2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] array= {1,2,9,3,5,4};
			System.out.println("Element at index 0 is "+ array[0]);
			System.out.println("Element at index 6 is " + array[6]); //ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException "+e);
		}
		finally {
		    // Code that will always be executed
		    System.out.println("Finally block executed");
		}
	}

}
/*Output
Element at index 0 is 1
ArrayIndexOutOfBoundsException java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
Finally block executed
*/