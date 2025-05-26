package myInterface;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike(0, 5, 4);
		System.out.println("Gear is "+bike.gear);
		System.out.println("Seat height is "+bike.seathieght);
		System.out.println("Speed: "+bike.speed);
		bike.speedup(4);
		System.out.println("Speed after increase: "+bike.speed);
		bike.speeddown(2);
		System.out.println("Speed after applying break: "+bike.speed);
	}
}
/*Op:
Gear is 4
Seat height is 5
Speed: 35
Speed after increase: 39
Speed after applying break: 37
*/