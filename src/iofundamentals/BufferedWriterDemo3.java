package iofundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo3 {
	
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
	
		
		try(var out = new BufferedWriter(
						new FileWriter("test1.txt"))){
			out.write("Hello World!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
