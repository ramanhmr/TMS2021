package task2;

import textFormatter.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static final String INPUT_FILE = "Lesson11/src/task2/input.txt";
    private static final String OUTPUT_FILE = "Lesson11/src/task2/output.txt";

    public static void main(String[] args) {
        String text = null;
        try {
            text = Files.readString(Path.of(INPUT_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> sentences = TextFormatter.getSentencesFromText(text);
        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            int numberOfWords = TextFormatter.getCountWordsInString(sentence);
            if (TextFormatter.hasPalindromeInString(sentence) || (numberOfWords >= 3 && numberOfWords <= 5)) {
                filteredSentences.add(sentence);
            }
        }
        try {
            Files.write(Path.of(OUTPUT_FILE), filteredSentences);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
