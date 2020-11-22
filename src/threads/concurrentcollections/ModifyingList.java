package threads.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModifyingList {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		Iterator listIter = aList.iterator();
		for (String s: aList) {
			System.out.println(s);
			aList.add("four");
		}
	}
}