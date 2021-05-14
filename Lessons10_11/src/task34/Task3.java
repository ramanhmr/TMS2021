package task34;

import java.io.File;
import java.util.List;

public class Task3 {
    private static final String INPUT_FILE = "Lessons10_11\\src\\input.txt";
    private static final String OUTPUT_FILE = "Lessons10_11\\src\\output.txt";

    public static void main(String[] args) {
        List<String> fileContains = FileOperator.readFile(new File(INPUT_FILE));
        FileOperator.createFile(TextFormatter.getPalindromes(fileContains), OUTPUT_FILE);
    }
}
