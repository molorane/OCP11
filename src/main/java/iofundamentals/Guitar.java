package iofundamentals;

import java.io.*;

public class Guitar {
	public void readMusic(File f) {
		try (BufferedReader r = new BufferedReader(new FileReader(f))) {
			final String music = null;
			try {
				while ((music = r.readLine()) != null)
					System.out.println(music);
			} catch (IOException e) {
				
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} finally {
			
		}
	}
}