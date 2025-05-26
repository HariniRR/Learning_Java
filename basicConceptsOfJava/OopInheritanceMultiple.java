package OopsConcepts;
interface Leo{
	void isHunt();
}
interface jaguar{
	void isSleep();
}
class CatFamily implements Leo, jaguar{

	@Override
	public void isSleep() {
		// TODO Auto-generated method stub
		System.out.println("Cat family members sleep between 12 and 18 hours per day");
	}

	@Override
	public void isHunt() {
		// TODO Auto-generated method stub
		System.out.println("Cat family members are Carnivorous");
	}
}


public class OopInheritanceMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatFamily cat=new CatFamily();
		cat.isSleep();
		cat.isHunt();
	}
}
/*Output
Cat family members sleep between 12 and 18 hours per day
Cat family members are Carnivorous
*/