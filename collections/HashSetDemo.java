package collections;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<Integer>();
		for(int i=0;i<11;i++) {
			set1.add(i);
		}						//adding elements
		System.out.println(set1);
		set1.remove(3);
		System.out.println(set1);
		System.out.println(set1.contains(9));
		System.out.println(set1.size());
		set1.clear();
		System.out.println(set1.isEmpty());
		
	}

}
/*Output
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 1, 2, 4, 5, 6, 7, 8, 9, 10]
true
10
true
*/