package task34;

import java.io.File;
import java.util.ArrayList;

public class Task4 {
    private static final String INPUT_FILE = "Lesson10/src/input4.txt";
    private static final String OUTPUT_FILE = "Lesson10/src/output4.txt";

    public static void main(String[] args) {
        ArrayList<String> fileContains = (ArrayList<String>) FileOperator.readFile(new File(INPUT_FILE));
        ArrayList<String> sentences = new ArrayList<>(fileContains);
        for (String string : sentences) {
            int numberOfWords = TextFormatter.countWords(string);
            if (!(TextFormatter.hasPalindrome(string) || (numberOfWords <= 5 && numberOfWords >= 3))) {
                fileContains.remove(string);
            }
        }
        FileOperator.writeDataToFile(fileContains, OUTPUT_FILE);
    }
}
