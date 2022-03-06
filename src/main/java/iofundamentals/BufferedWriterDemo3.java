package iofundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

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
	
	class C{
		
		
		public void m() {
			int i = (i=9)*4;
		}
	}
	

	public static void main(String[] args) {
		
		try(var out = new BufferedWriter(
						new FileWriter("test1.txt"))){
			out.write("Hello World!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
