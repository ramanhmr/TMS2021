package task34;

import java.io.File;
import java.util.List;

public class Task3 {
    private static final String INPUT_FILE = "Lesson10/src/input.txt";
    private static final String OUTPUT_FILE = "Lesson10/src/output.txt";

    public static void main(String[] args) {
        List<String> fileContains = FileOperator.readFile(new File(INPUT_FILE));
        FileOperator.writeDataToFile(TextFormatter.getPalindromes(fileContains), OUTPUT_FILE);
    }
}
