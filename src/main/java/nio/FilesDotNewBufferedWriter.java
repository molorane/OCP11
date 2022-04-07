package nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDotNewBufferedWriter {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("gorilla.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-16"))) {
            writer.write("Hello World");
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
