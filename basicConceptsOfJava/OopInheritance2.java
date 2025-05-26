package OopsConcepts;
//hybrid inheritance
class SolarSystem {
}
class Earth extends SolarSystem {
}
class Mars extends SolarSystem {
}
public class OopInheritance2 extends Earth{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
	}

}
/* Output
true
true
true
*/