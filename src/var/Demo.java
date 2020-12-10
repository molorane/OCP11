package var;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
	
	
	public static void main(String[] args) {
		Predicate<String> p = (var c) -> true;
		List<String> list = new ArrayList<>();
		
		var arr = new int[] {1,2,3,4};
		
		System.out.println(arr.length);
	}
}
