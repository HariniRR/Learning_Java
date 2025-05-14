package basicConceptsOfJava;
import java.lang.String;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PinkRoses";
		String str1="PinkRoses";
		String str2="RedRoses";
		String str3="Roses";
		String str4="	Garden	";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.codePointAt(3));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(2, 7));
		System.out.println(str1.concat(str2));
		System.out.println(str1.contains(str));
		System.out.println(str1.endsWith(str3));
		System.out.println(str1.startsWith("Pink"));
		System.out.println(str.isEmpty());//isBlank()
		System.out.println(str4.trim());
		System.out.println(str1);
		System.out.println(str1.replaceAll(str3, "Farm"));
		
		String a = "Daisy";
		String b="Daisy";
		String c=new String("Daisy");
		System.out.println(a.compareTo(b)); 
		System.out.println(a.compareToIgnoreCase(b)); 
		/*Returns an integer value: 0 if the string is equal to the other string, ignoring case differences.
		< 0 if the string is lexicographically less than the other string
		> 0 if the string is lexicographically greater than the other string*/
		 System.out.println(a == b);         
	     System.out.println(a == c);          
	     System.out.println(a.equals(c));
	     /*==	-> To compare Reference
	       .equals()	-> To compare the content*/
	     }

}
/*Output
PinkRoses
9
n
107
pinkroses
PINKROSES
nkRos
PinkRosesRedRoses
true
true
true
false
Garden
PinkRoses
PinkFarm
0
0
true
false
true
*/
