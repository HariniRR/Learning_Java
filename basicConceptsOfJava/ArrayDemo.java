package basicConceptsOfJava;

public class ArrayDemo {

    public static void main(String[] args) {
        String[] arr = {"apple", "mango", "dates", "papaya", "coconut"};
        
        System.out.println(arr);//accessing through index
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
      //arr.sort(), arr.toString(), etc
        int[][] arr1 = {{1, 2, 3, 4}, {7, 8, 9, 4}};
        int[][] arr2 = {{4, 5, 6, 2}, {5, 2, 7, 6}};
        int[][] sum = new int[2][4];
      //matrix addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*Output
 [Ljava.lang.String;@2b2fa4f7
apple
mango
dates
papaya
coconut
5 7 9 6 
12 10 16 10 
 */


