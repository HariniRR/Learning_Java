package basicConceptsOfJava;

public class Methods {
	public static String initial() {
		return "Calculations Started";
	}
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public float div(int a,int b) {
		float div=a/b;
		return div;
	}
	public int modulo(int a,int b) {
		int modulo=a%b;
		return modulo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(initial());
		Methods obj=new Methods();
		int s=obj.add(45, 28);
		System.out.println("Sum : "+s);
		System.out.println("Difference: "+obj.sub(45,28));
		System.out.println("Product: "+obj.mul(45,28));
		System.out.println("Division: "+obj.div(45,28));
		System.out.println("Remainder: "+obj.modulo(45,28));
	}

}
/*Output
Calculations Started
Sum : 73
Difference: 17
Product: 1260
Division: 1.0
Remainder: 17
*/