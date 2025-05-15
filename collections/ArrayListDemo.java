package collections;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>(10);
		//List<Integer> list=new ArrayList<Integer>(); interface and concrete class implementations
		for(int i=0;i<10;i++)
		{
			list.add(i); //adding elements to the arraylist
			}
		System.out.println(list); //printing the list
		list.remove(6); //removing an element by accessing index value
		System.out.println(list);
		System.out.println(list.get(6));
		
		System.out.println(list.set(1, 2)); //.set(index,value)
		System.out.println(list);
		
		System.out.println(list.size());
		list.clear();
		System.out.println(list.isEmpty());
		
		//import java.util.Collections;
		//Collections.sort(myNumbers);
		}

}
/*Output
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
[0, 1, 2, 3, 4, 5, 7, 8, 9]
7
1
[0, 2, 2, 3, 4, 5, 7, 8, 9]
9
true
*/