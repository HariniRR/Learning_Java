package basicConceptsOfJava;

import java.util.Arrays;

//Define a Student class that implements Comparable.
class Student implements Comparable<Student> {
 private String name;
 private int id;

 public Student(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }

 @Override
 public String toString() {
     return "Student [name=" + name + ", id=" + id + "]";
 }

 // Implement compareTo() method to compare students by ID.
 @Override
 public int compareTo(Student other) {
     // Compare students based on their ID.
     // Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     return this.id - other.id; //current obj - foreign obj
 }
}

public class ComparableDemo {
 public static void main(String[] args) {
     Student[] students = {
             new Student("Olivia", 103),
             new Student("Bob", 101),
             new Student("Oogy", 105),
             new Student("Jack", 102)
     };

     // Display students before sorting.
     System.out.println("Students before sorting:");
     for (Student student : students) {
         System.out.println(student);
     }

     // Sort the array using the natural ordering defined by compareTo.
     Arrays.sort(students);

     // Display students after sorting.
     System.out.println("\nStudents after sorting:");
     for (Student student : students) {
         System.out.println(student);
     }
 }
}

/*op
Student [name=Olivia, id=103]
Student [name=Bob, id=101]
Student [name=Oogy, id=105]
Student [name=Jack, id=102]

Students after sorting:
Student [name=Bob, id=101]
Student [name=Jack, id=102]
Student [name=Olivia, id=103]
Student [name=Oogy, id=105]
*/
