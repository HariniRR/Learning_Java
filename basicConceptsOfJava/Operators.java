package basicConceptsOfJava;

public class Operators {

	public static void main(String[] args) {
		// Assignment operators
		int a=34;
		int b=15;
		int c=0;
		System.out.println("intialized Values: a:" + a + ", b:" + b + ", c:" + c);
		// Arithmetic operators
		int sum=a+b;
		int dif=a-b;
		int product=a*b;
		float div=a/b;
		int rem=a%b;
		System.out.println("Sum:"+sum+", Difference:"+dif+", Multiplication:"+product+", Division:"+div+", Modulo Division:"+rem);
		//unary, logical and comparison operator
		if(div > rem && div != dif ) {
			c=b++;
			System.out.println("yes, c got a new value"+c);
		}
		else {
			c=b--;
			System.out.println("No, c got a new value"+c);
		}
		//Bitwise operators
        int a1 = 5;   
        int b1 = 3;   
        // Bitwise AND
        int andResult = a1 & b1;        // 0101 & 0011 = 0001 (1)
        System.out.println("a & b = " + andResult);
        // Bitwise OR
        int orResult = a1 | b1;         // 0101 | 0011 = 0111 (7)
        System.out.println("a | b = " + orResult);
        // Bitwise XOR
        int xorResult = a1 ^ b1;        // 0101 ^ 0011 = 0110 (6)
        System.out.println("a ^ b = " + xorResult);
        // Bitwise NOT
        int notResult = ~a1;           // ~0101 = 1010 (in two's complement = -6)
        System.out.println("~a = " + notResult);
        // Left Shift
        int leftShiftResult = a1 << 1; // 0101 << 1 = 1010 (10)
        System.out.println("a << 1 = " + leftShiftResult);
        // Right Shift
        int rightShiftResult = a1 >> 1; // 0101 >> 1 = 0010 (2)
        System.out.println("a >> 1 = " + rightShiftResult);
        // Unsigned Right Shift
        int negative = -5;            
        int unsignedRightShiftResult = negative >>> 1;
        System.out.println("-5 >>> 1 = " + unsignedRightShiftResult);
	}

}
/* Output:
Initialized Values: a:34, b:15, c:0
Sum:49, Difference:19, Multiplication510, Division2.0, Modulo Division4
No, c got a new value15
a & b = 1
a | b = 7
a ^ b = 6
~a = -6
a << 1 = 10
a >> 1 = 2
-5 >>> 1 = 2147483645 */