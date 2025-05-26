package accessModifier_Inheritance;
//Base class
public class Cycle {
	int applybreak; //default | no modifier
	int seathieght;
	int speed=35;
//	private int tyreStatus=0; hiding from child class
	public Cycle(int applybreak, int seathieght) {
		this.applybreak=applybreak;
		this.seathieght=seathieght;
	}
	protected  void speeddown(int breaks) {
		speed = speed-breaks;
	}
	protected  void speedup(int accelerator) {
		speed +=accelerator;
	}
	protected void setHeight(int newHeight) {
		seathieght=newHeight;
	}

}
