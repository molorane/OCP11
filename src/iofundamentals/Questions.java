package iofundamentals;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questions {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
		p();
	}

	public static void p() throws IOException {
		FileInputStream findings = new FileInputStream("log.txt");
		DataInputStream dataStream = new DataInputStream(findings);
		BufferedReader br = new BufferedReader(new InputStreamReader(dataStream));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
