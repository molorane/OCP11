package enthware.collections;

import java.util.Arrays;
import java.util.Comparator;

class MyStringComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		int s1 = ((String) o1).length();
		int s2 = ((String) o2).length();
		return s1 - s2;
	}
}

public class BInarySearchDemo {
	
	static String[] sa = { "d", "bbb", "aaaa" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = Arrays.binarySearch(sa, "cc", new MyStringComparator());
		System.out.println(i);
		
		int i1 = Arrays.binarySearch(sa, "", new MyStringComparator()); 
		System.out.println(i1);
	}

}
