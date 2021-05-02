package task1;

import textFormatter.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task1 {
    private static final String INPUT_FILE = "Lesson11/src/task1/input.txt";
    private static final String OUTPUT_FILE = "Lesson11/src/task1/output.txt";

    public static void main(String[] args) {
        try {
            List<String> words = Files.readAllLines(Path.of(INPUT_FILE));
            Files.write(Path.of(OUTPUT_FILE), TextFormatter.getPalindromes(words));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
