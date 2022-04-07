package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardCopyOption.*;

public class ReadAllLines {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("demo2.tx");

        List<String> lines = Files.readAllLines(p1);

        lines.forEach(System.out::println);

    }

}
