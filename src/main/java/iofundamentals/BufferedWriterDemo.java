package iofundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
	
	/**
	 * FileOutputStream
	 * FileInputStream
	 * 
	 * BufferedReader --> Reader
	 * BufferedWriter --> Writer
	 * 
	 * PrintStream --> System.out , System.err
	 * PrintWriter
	 */

	public static void main(String[] args) {
		
		try(Writer w = new FileWriter("test1.txt");
				BufferedWriter bw = new BufferedWriter(w);){
			bw.write("Hello World!");
			bw.flush();
			bw.write("Worwrwr!");
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
