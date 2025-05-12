package basicConceptsOfJava;

public class CtrlflowJumping {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {           
            for (int j = 1; j <= size; j++) {                
                if ((i == 2 && j == 3) || (i == 3 && j == 4) || (i == 4 && j == 5)) {
                    System.out.print("  ");  
                    continue;                
                }
                if (j > size - i + 1) {
                    break;   
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Output
//* * * * * 
//* *   * 
//* * *   
//* * 
//* 