package nio;

import java.io.*;
import java.nio.file.*;

public class Notes {
	public void printNotes() {
		try (OutputStream out = System.out) { // y1
			Files.copy(Paths.get("log.txt"),out);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] coursework) {
		new Notes().printNotes();
	}
}