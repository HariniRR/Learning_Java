package basicConceptsOfJava;
import java.util.Scanner;
//factorial of a number
public class RecursionExample {
	static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num * factorial(num-1); //recursion
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=s.nextInt();
		System.out.println("Factorial of "+num+" is "+factorial(num));
	}

}
/*Output
Enter a number: 5
Factorial of 5 is 120
*/