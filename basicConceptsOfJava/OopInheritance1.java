package OopsConcepts;
//Hierarchical inheritance
class Animal{
	public void printAnimal() {
		System.out.println("Animal Class");}
}
class Cat extends Animal{
	public void printCat() {
		System.out.println("Cat Class");
		}
}
class Tiger extends Animal{
	public void printTiger() {
		System.out.println("Tiger Class");
		}
}
class Lion extends Animal{
	public void printLion() {
		System.out.println("Lion Class");
		}
}
public class OopInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c= new Cat();
		c.printAnimal();
		c.printCat();
		
		Tiger t=new Tiger();
		t.printAnimal();
		t.printTiger();
		
		Lion l=new Lion();
		l.printAnimal();
		l.printLion();
	}

}
/*Output
Animal Class
Cat Class
Animal Class
Tiger Class
Animal Class
Lion Class
*/