package nio;

import java.nio.file.*;

public class Rose {
	public void tendGarden(Path p) throws Exception {
		Files.walk(p, 1).map(p -> p.toRealPath()).forEach(System.out::println);
	}

	public static void main(String... thorns) throws Exception {
		new Rose().tendGarden(Paths.get(thorns[0]));
	}
}
