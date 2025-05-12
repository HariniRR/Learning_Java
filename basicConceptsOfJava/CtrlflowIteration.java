package basicConceptsOfJava;

import java.util.Scanner;
public class CtrlflowIteration {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int[][] arr = new int[4][3];
			// Input using while loops
			int i = 0;
			while (i < arr.length) {
			    int j = 0;
			    while (j < arr[i].length) {
			        System.out.print("Enter element for arr[" + i + "][" + j + "]: ");
			        arr[i][j] = sc.nextInt();
			        j++;
			    }
			    i++;
			}
			System.out.println();

			System.out.println("Printing with for loops:");
			    for (i = 0; i < arr.length; i++) {
			        for (int j = 0; j < arr[i].length; j++) {
			            System.out.print(arr[i][j] + " ");
			        }
			        System.out.println();
			    }

			    System.out.println("Printing with foreach loops:");
			    for (int[] row : arr) {
			        for (int element : row) {
			            System.out.print(element + " ");
			        }
			        System.out.println();
			    }
			    sc.close();
		}
    }
}
/*Output
Enter element for arr[0][0]: 1
Enter element for arr[0][1]: 4
Enter element for arr[0][2]: 5
Enter element for arr[1][0]: 6
Enter element for arr[1][1]: 9
Enter element for arr[1][2]: 7
Enter element for arr[2][0]: 1
Enter element for arr[2][1]: 2
Enter element for arr[2][2]: 8
Enter element for arr[3][0]: 4
Enter element for arr[3][1]: 6
Enter element for arr[3][2]: 2

Printing with for loops:
1 4 5 
6 9 7 
1 2 8 
4 6 2 
Printing with foreach loops:
1 4 5 
6 9 7 
1 2 8 
4 6 2 
*/