package basicConceptsOfJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=new ArrayList<>();
		mylist.add(2);
		mylist.add(3);
		mylist.add(5);
		mylist.add(7);
		mylist.add(11);
		System.out.println("The list"+ mylist);
//		ArrayList<Integer> squaredList=new ArrayList<>();
//		for(Integer i:mylist) {
//			squaredList.add(i*i);
//		}
		List<Integer> squaredList=mylist.stream().map(a -> a*a).collect(Collectors.toList()); //similar to sets etc
		System.out.println("Squared list"+ squaredList);
	}

}
/*op
The list[2, 3, 5, 7, 11]
Squared list[4, 9, 25, 49, 121]*/