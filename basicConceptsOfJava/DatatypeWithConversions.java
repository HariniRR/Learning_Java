package basicConceptsOfJava;

public class DatatypeWithConversions {

	public static void main(String[] args) {
		// Primitive DataTypes
		byte b = 4;
		System.out.println("byte : " +b);
		short s = 5;
		System.out.println("short : "+s);
		int a = 5;
		System.out.println("integer : " + a);
		long l = 698;
		System.out.println("long : " + l);
		float f = 77.0f;
		System.out.println("float : " + f);
		double d = 333.3;
		System.out.println("double : " + d);
		boolean O = true;
		System.out.println("boolean : " + O);
		char c = 'F';
		System.out.println("character : " + c);
		
		//Non-Primitive DataTypes
		String str = "helloWorld";
		System.out.println("string : " + str);
		System.out.println("string[0] : " + str.charAt(0));
		int[] arr = {1,2,3,4,5};
		for(int item : arr) {
			System.out.print(item + ",");
		}
		System.out.println("The 1D array elements");
		System.out.println("3rd element of the 1D array : " + arr[2]);
		//Implicit Type Conversion
		short b1=b;
		int b2=b1;
		int c1=c;// integer to long, float, double
		long c2=c1;//long to float, double
		float c3=c2;
		double c4 = c3;
		System.out.println("Byte:"+b+", byte to short:"+b1+", short to int:"+b2+", character to integer:"+c1+", integer to long:"+c2+", long to float:"+ c3 +", float to double:"+c4);
		
		//Explicit Type Conversion
		float d1=(float)d;
		long d2=(long)d1;
		int d3=(int)d2;
		short d4=(short)d3;
		byte d5=(byte)d4;
		int d6=(int)d1;
		System.out.println("Double:"+d+", Double to float:"+ d1+ ", float to long:"+d2+", long to integer:" +d3+", integer to short:"+d4+", short to byte:"+d5+", float to integer:"+d6);
	}

}

/*Output
byte : 4
short : 5
integer : 5
long : 698
float : 77.0
double : 333.3
boolean : true
character : F
string : helloWorld
string[0] : h
1,2,3,4,5,The 1D array elements
3rd element of the 1D array : 3
Byte:4, byte to short:4, short to int:4, character to integer:70, integer to long:70, long to float:70.0, float to double:70.0
Double:333.3, Double to float:333.3, float to long:333, long to integer:333, integer to short:333, short to byte:77, float to integer:333
*/
