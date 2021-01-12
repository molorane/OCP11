package enthware.collections;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TailMap {

	public static void main(String[] args) {
		TreeSet<E> s = null;
		s.subSet(1, false, 2, 2);
		NavigableMap<String, String> mymap = new TreeMap<String, String>();
		mymap.put("a", "apple");
		mymap.put("b", "boy");
		mymap.put("c", "cat");
		mymap.put("aa", "apple1");
		mymap.put("bb", "boy1");
		mymap.put("cc", "cat1");
		mymap.pollLastEntry(); 
		mymap.pollFirstEntry(); //LINE 2 
		
		NavigableMap<String, String> tailmap = mymap.tailMap("b", false); //LINE 3
		System.out.println(tailmap.pollFirstEntry()); //LINE 4
		System.out.println(mymap.size()); //LINE 5
	}

}
