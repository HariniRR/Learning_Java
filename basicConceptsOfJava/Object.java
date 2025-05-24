package OopsConcepts;
public class Object {
String name;
String category;
String color;
void isBloom() {
	System.out.println("Name: "+name);
	System.out.println("Category :"+category);
	System.out.println("Color: "+color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object flower=new Object();
		flower.name="marigold";
		flower.category="annual";
		flower.color="red";
		flower.isBloom();
	}

}
/*Output
Name: marigold
Category :annual
Color: red
*/