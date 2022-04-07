package assertions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class AssertionExample1 {

    public static void main(String[] args) {
        try (Scanner consoleScanner = new Scanner(System.in)) {
            consoleScanner.close(); // CLOSE
            consoleScanner.close();
        }
    }

}
