package OopsConcepts;
class Trees{
	public void tree() {
		System.out.println("I am a Tree");
	}
}
class Neem extends Trees{
	@Override
	public void tree() {
		System.out.println("I am a Neem Tree");
	}
}
class Peach extends Trees{
	@Override
	public void tree() {
		System.out.println("I am a Peach Tree");
	}
}
public class OopOverRide {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trees flower;
		flower =new Trees();
		flower.tree();
		flower =new Peach();
		flower.tree();
		flower=new Neem();
		flower.tree();
	}

}
/*Output
I am a Tree
I am a Peach Tree
I am a Neem Tree
*/