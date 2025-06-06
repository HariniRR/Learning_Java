/*You just need to take string input and checks whether the string consists of only numeric characters.

Input Format
You will be given a function with string as single argument. 

Constraints
1 <= |S| <= 10^4

Output Format
You need to return the string value either "True" or "False". */

import java.io.*;
import java.util.*;
public class Numeric {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(isNumeric(str));
    	//Write code here

   }
   static String isNumeric(String input){
       int i = input.length() - 1;
       while(i>=0){
           if(Character.isDigit(input.charAt(i))){
               return "False";
           }
           else{
               continue;
           }
           i-=1;
       }
       return "True";
   }
}

