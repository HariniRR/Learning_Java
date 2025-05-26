package OopsConcepts;
//multilevel inheritance
class Tree{
	int randomVar = 4;
	public void neem() {
		System.out.println("Neem tree");
	}
}
class Root extends Tree{ 		//single inheritance
	public void banana() {
	System.out.println("Plantation Tree");
}}
class Stem extends Root{
	public void coconut() {
		System.out.println("Coconut Tree");
	}
}
class Flower extends Stem{
	public void mango() {
		System.out.println("Mango Tree");
	}
}
public class OopInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower fruit=new Flower();
		fruit.mango();
		fruit.coconut();
		fruit.neem();
		System.out.println(fruit.randomVar);
	}

}
/*Output
Mango Tree
Coconut Tree
Neem tree
4
*/

/* Types of Inheritance
single
multiple
multilevel
Hierarchical
Hybrid
*/