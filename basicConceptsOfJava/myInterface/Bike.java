package myInterface;

public class Bike implements Cycle {	
	int applybreak; 
	int seathieght;
	int speed=35;
	int gear;
public Bike(int applybreak, int seathieght,int gear) {
	this.applybreak=applybreak;
	this.seathieght=seathieght;
	this.gear=gear;
}
public  void speeddown(int breaks) {
	speed = speed-breaks;
}
public  void speedup(int accelerator) {
	speed +=accelerator;
}
public void setHeight(int newHeight) {
	seathieght=newHeight;
}
protected void setGear(int newGearNum) {
	gear=newGearNum;
}

}
