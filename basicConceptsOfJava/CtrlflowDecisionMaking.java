package basicConceptsOfJava;
import java.util.Scanner;
public class CtrlflowDecisionMaking {
	// Nested If, ladder If and Switch Case
	public static void printCategory(String category) {
		switch (category) {
		    case "Invalid":
		       System.out.println("Invalid age.");
		       break;
		    case "Child":
		        System.out.println("You are a Child.");
		        break;
		    case "Teenager":
		        System.out.println("You are a Teenager.");
		        break;
		    case "Adult":
		        System.out.println("You are an Adult.");
		        break;
		    case "Senior":
		        System.out.println("You are a Senior.");
		        break;
		    default:
		        System.out.println("Unknown category.");
		        break;
		        }
		    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		String category; 
        String result;
		String v="valid";
		String i="invalid";
		result = age > 0 ? v :i ; //If-else using Ternary Operator
		System.out.println("Given input is "+result);
		if (age < 0) {
		    category = "Invalid";
		    } 
		 else {
		    if (age <= 12) {
		        category = "Child";
		    	  } 
		    else if(age <= 19) { 
		        category = "Teenager";
		     	  } 
		    else if (age <= 59) {
		        category = "Adult";
		          } 
		    else {
		       category = "Senior";
		         }
		        }
		 printCategory(category);
		 scanner.close();
		     }
		   }
		    
/*output
 Enter your age: 25
Given input is valid
You are an Adult.
*/	
