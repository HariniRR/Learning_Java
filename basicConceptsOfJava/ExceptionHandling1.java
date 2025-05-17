package basicConceptsOfJava;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=34;
			int b=0;
			System.out.println("Division Operation : " + a/b); //ArithmeticException
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException "+e);
		}
	}

}
//Output: ArithmeticException java.lang.ArithmeticException: / by zero

/*
NullPointerException
ArithmeticException
StringIndexOutOfBoundsException
FileNotFoundException
NumberFormatException
ArrayIndexOutOfBoundsException
ioException
NoSuchElementException
ClassNotFoundException, etc
*/