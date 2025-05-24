package OopsConcepts;
//flower
public class Constructors {
String name;
String color;
String category;
public Constructors() {
	name="daisy";
	color="pink";
	category="Annual";
	System.out.println(" Name: "+name+"\n Color: "+color+"\n Category: "+category);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors flower=new Constructors();
	}

}

/*Output
  Name: daisy
 Color: pink
 Category: Annual
 */



//public Constructors() {
//	name="daisy";
//	color="pink";
//	category="Annual";
//
//}
//public void display() {
//	System.out.println(" Name: "+name+"\n Color: "+color+"\n Category: "+category);
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Constructors flower=new Constructors();
//		flower.display();
//	}
	