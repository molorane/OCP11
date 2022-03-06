package streams;

import java.util.List;
import java.util.stream.Stream;

public class Question {

	public static void main(String[] args) {
		var lst = List.of(1, 2, 3, 4);
		lst.replaceAll(x -> x + 100);
		System.out.println("-Completed-");
	}

}
