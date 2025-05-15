package collections;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap=new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		hashMap.put("f", 4);
		hashMap.put("d", 5);
		hashMap.put("e", 5);//putAll()
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		System.out.println(hashMap.values());
		hashMap.replace("e", 7);
		System.out.println(hashMap);
		hashMap.replace("e", 7, 6);
		System.out.println(hashMap);
		hashMap.remove("e", 6);//.remove(object key);
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.containsKey("d"));//containsValue(object value);
		System.out.println(hashMap.get("f"));
		hashMap.clear();//.clone();
		System.out.println(hashMap.isEmpty());
		//LinkedHashMap has properties of hashMap and Linked list so that it follows the insertion ordering
	}

}

/*Output
{a=1, b=2, c=3, d=5, e=5, f=4}
6
[1, 2, 3, 5, 5, 4]
{a=1, b=2, c=3, d=5, e=7, f=4}
{a=1, b=2, c=3, d=5, e=6, f=4}
{a=1, b=2, c=3, d=5, f=4}
[a, b, c, d, f]
true
4
true
*/