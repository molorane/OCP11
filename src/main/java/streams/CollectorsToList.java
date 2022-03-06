package streams;

import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.List;

public class CollectorsToList {
	public static void main(String[] args) {
		String frenchCounting = "un:deux:trois:quatre";
		List<String> gmailList = Pattern.compile("[^0-9a-zA-Z]")
				.splitAsStream(frenchCounting)
				.collect(Collectors.toList());
		gmailList.forEach(System.out::println);
	}
}