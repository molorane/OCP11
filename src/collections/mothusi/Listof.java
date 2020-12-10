package collections.mothusi;

import java.util.List;

public class Listof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> list = List.of(1,2,3,4,null);
			List<Integer> list2 = List.copyOf(list);
			System.err.println("Okay");
	}

}
