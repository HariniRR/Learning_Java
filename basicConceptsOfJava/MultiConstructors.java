package OopsConcepts;
//cats(Overloading happens)
public class MultiConstructors {
	String name;
	String breed;
	String color;
	int colors;
	String sounds;
public MultiConstructors(String name, String breed, String color, String sounds) {
	this.name=name;
	this.breed=breed;
	this.color=color;
	this.sounds=sounds;
}
public MultiConstructors(String n, String b, String c) {
	name=n;
	breed=b;
	color=c;
	sounds="meow";
}
public MultiConstructors(String name,String breed, int color) {
	this.name=name;
	this.breed=breed;
	this.colors = color;
	sounds="Chirp";
}
public MultiConstructors() {
	name="Stella";
	breed="Sphynx";
	sounds="meow";
	color="appeared with wrinkled skin and no hair";
}
void toPrint() {
	if(color== null) {
		color="grey";
		System.out.println("My cat name is "+ name +" and she is a "+ breed +" cat in "+ color+" and mostly sounds "+ sounds+" that I loves a lot.");
}
	else
		System.out.println("My cat name is "+ name +" and she is a "+ breed +" cat in "+ color+" and mostly sounds "+ sounds+" that I loves a lot.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiConstructors cat=new MultiConstructors("Luna","Siamese","Black and white","purr"); 
		cat.toPrint();
		MultiConstructors cat1 = new MultiConstructors("Snow","Persian","white"); 
		cat1.toPrint();
		MultiConstructors cat2=new MultiConstructors("mochi","Maine Coon", 808080); 
		cat2.toPrint();
		MultiConstructors cat3 = new MultiConstructors(); 
		cat3.toPrint();
	}

}
/* Output
My cat name is Luna and she is a Siamese cat in Black and white and mostly sounds purr that I loves a lot.
My cat name is Snow and she is a Persian cat in white and mostly sounds meow that I loves a lot.
My cat name is mochi and she is a Maine Coon cat in grey and mostly sounds Chirp that I loves a lot.
My cat name is Stella and she is a Sphynx cat in appeared with wrinkled skin and no hair and mostly sounds meow that I loves a lot.
*/