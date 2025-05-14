package helloapplication;
import java.util.Scanner;
public class UserInput {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		//input in 1 line (numerical or non-numerical)
		System.out.print("Enter a String : ");
		String str=s.nextLine();
		//input as a array
		int i = 0;
		int[] arr=new int[5];
		System.out.println("Enter any 5 integer items : ");
		while( i<5) {
			arr[i]=s.nextInt();
			i++;
		}
		System.out.println("your string is "+str);
		System.out.println("The array elements are : ");
		for(i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		s.close();
	}

}
/*output
Enter a String : hai, i am hari
Enter any 5 integer items : 
8
9
6
5
3
your string is hai, i am hari
The array elements are : 
8
9
6
5
3
*/