package threads.questions;

import java.util.concurrent.*;
import java.util.*;

class COWArrayListTest {
	public static void main(String[] args) {
		List<Integer> aList = new CopyOnWriteArrayList<Integer>(); // LINE A
		aList.addAll(Arrays.asList(10, 20, 30, 40));
		System.out.println(aList);
		
	}
}