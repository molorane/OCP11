package iofundamentals;

import java.io.*;

public class Journey {
	public static void main(String[] dig) {
		File file = new File("/Earth");
		System.out.print(file.getParent() + " - " + file.getParent());
	}
}