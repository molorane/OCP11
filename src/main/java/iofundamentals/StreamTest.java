package iofundamentals;

import java.io.*;

class StreamTest {
	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream("log.txt");
			System.setOut(ps);
			System.out.println("Test output to System.out");
			
			
			OutputStream os = new FileOutputStream("error.txt");
			System.setErr(new PrintStream(os)); // SET SYSTEM.ERR
			System.err.println("Error");
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
}