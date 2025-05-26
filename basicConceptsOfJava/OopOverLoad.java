package OopsConcepts;
public class OopOverLoad {
	void print(String s) {
		System.out.println("I like "+s);
	}
	void print(int a,String s) {
		System.out.println("I want "+a +" "+s);
	}
	void print(int l) {
		System.out.println("My lucky number is "+l);
	}
	void print (String f1,String f2) {
		System.out.println("I like "+f1+" and "+f2+" flavors ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopOverLoad load=new OopOverLoad();
		load.print("Ice cream");
		load.print("Strawberry","cherry");
		load.print(2);
		load.print(2,"Apples");
	}

}
/*output
I like Ice cream
I like Strawberry and cherry flavors 
My lucky number is 2
I want 2 Apples
*/