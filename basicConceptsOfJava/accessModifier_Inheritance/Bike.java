package accessModifier_Inheritance;
//subclass
public class Bike extends Cycle {
	int gear;
	public Bike(int applybreak, int seathieght,int gear) {
		super( applybreak,  seathieght);	//initializing base class constructor
		this.gear=gear;
	}
	protected void setGear(int newGearNum) {
		gear=newGearNum;
	}

}
