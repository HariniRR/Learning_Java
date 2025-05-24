package basicConceptsOfJava;

public class ExceptionHandling3 {
void validity(int age) throws IllegalArgumentException{
	try {
		if (age<0)
			throw new IllegalArgumentException("Age can not be negaative");
		else
			System.out.println("Access Granted");
	}
	catch (Exception e) {
		System.out.println("Exception caught: " + e.getMessage());
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling3 obj = new ExceptionHandling3();
		int age=-5;
		int age1=20;
		obj.validity(age1);
		obj.validity(age);
	}

}
/*Output
Access Granted
Exception caught: Age can not be negaative
*/
