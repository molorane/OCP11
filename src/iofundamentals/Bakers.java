package iofundamentals;

import java.io.*;

public class Bakers {
	public static void main(String... tooMany) throws IOException {
		File cake = new File("cake.txt");
		Writer pie = new FileWriter("pie.txt");
		pie.flush();
		new File("fudge.txt").mkdirs();
	}
}
