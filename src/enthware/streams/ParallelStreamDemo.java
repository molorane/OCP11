package enthware.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<String> vals = Arrays.asList("a", "f", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a",
				"b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g");
		String join = vals.parallelStream().reduce("_", (a, b) -> a.concat(b));
		System.out.println(join);
	}

}
