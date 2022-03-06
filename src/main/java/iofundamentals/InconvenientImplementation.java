package iofundamentals;

import java.io.*;

public class InconvenientImplementation {
	public static void main(String... dontDoThis) throws Exception {
		Console c = System.console();
		if (c != null) {
			c.writer().write('P');
			c.writer().write('a');
			c.writer().write('s');
			c.writer().write('s');
			c.writer().flush(); // t1
			int i;
			StringBuilder sb = new StringBuilder();
			while ((i = c.reader().read()) != 'x') { // t2
				sb.append((char) i);
			}
			c.writer().format("Result: %s", sb.toString());
		}
	}
	
	
	public String getNameQuick() throws IOException {
		final BufferedReader r = new BufferedReader(
		new FileReader("saved.name"));
		final String name = r.readLine();
		r.flush();
		return name;
		}public String getNameSafely() throws IOException {
		try(final BufferedReader r = new BufferedReader(
		new FileReader("saved.name"))) {
		final String name = r.readLine();
		r.flush();
		return name;
		}}
}
