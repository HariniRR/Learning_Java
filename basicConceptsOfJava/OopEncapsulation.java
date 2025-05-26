package OopsConcepts;

class Person {
 // Encapsulating the name and age  only approachable and used using methods defined
 private String name;
 private int age;
 private String address; //not accessible by ocher class

 public String getName() {  //accessible by ocher class
	 return name; 
	 }
 public void setName(String name) { 
	 this.name = name; 
	 }
 public int getAge() { 
	 return age; 
	 }
 public void setAge(int age) { 
	 this.age = age; 
	 }
 public String getAddress() { 
	 return address; 
	 }
 public void setAdress(String address) { 
	 this.address = address; 
	 }
}

public class OopEncapsulation {
 public static void main(String[] args)
 {
     Person hary = new Person();
     hary.setName("Harry Potter");
     hary.setAge(25);
     hary.setAdress("5, Nehru street, Mumbai");
     System.out.println("Name: " + hary.getName());
     System.out.println("Age: " + hary.getAge());
     System.out.println("Address: "+hary.getAddress());
 }
}
