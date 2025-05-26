package OopsConcepts;

import java.util.Scanner;

abstract class Shape{
	abstract int getArea();
	abstract int getVolume();
	void display() {
	System.out.println("This is shape class");
	}
}
class SquareArea extends Shape{
	int length;
	int area;
	void setLength(int length) {
		this.length=length;
	}
	@Override
	int getArea() {
		return length * length;
	}
}
class SquareVolume extends Shape{
	int length;
	int volume;
	void setLength(int length) {
		this.length=length;
	}  
	@Override
	int getVolume() {
		return length * length * length;
	}
}
public class OopAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length  of the circle, a: ");
		int a=sc.nextInt();
		SquareArea sq=new SquareArea();
		sq.setLength(a);
		System.out.println("Area of the Square: " + sq.getArea());
		SquareVolume sv=new SquareVolume();
		sv.setLength(a);
		System.out.println("Volume of the Square: " + sv.getVolume());
	}
}
/*Output
Enter the length  of the circle, a: 
5
Area of the Square: 25
Volume of the Square: 125
*/