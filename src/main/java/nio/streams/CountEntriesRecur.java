package nio.streams;

import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class CountEntriesRecur {
	public static void main(String[] args) throws IOException {
		try (Stream<Path> entries = Files.walk(Paths.get("C:\\Files\\"), 4, FileVisitOption.FOLLOW_LINKS)) {
			long numOfEntries = entries.count();
			System.out.printf("Found %d entries in the current path", numOfEntries);
		}
	}
}