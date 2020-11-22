package iofundamentals;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(PrintWriter out = new PrintWriter(
				System.out)){
			out.append("Hello World!");
		}
	}

}
