package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example8 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("/a/b/c/d");
		Path p2 = Paths.get("/a/b/c/d/e/f/");
		
		System.err.println(p2.relativize(p1));
		
		Path p3 = Paths.get("/b/c/d");
		Path p4 = Paths.get("/b/x/y");
		
		System.err.println(p3.relativize(p4));
		
		Path path1 = Paths.get("fish.txt");
		Path path2 = Paths.get("birds.txt");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		
	}

}
