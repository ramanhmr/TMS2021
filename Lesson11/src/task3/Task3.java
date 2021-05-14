package task3;

import textFormatter.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task3 {
    private static final String BLACKLIST = "Lesson11/src/task3/blacklist.txt";
    private static final String BLACKLIST_SEPARATOR = ", ";
    private static final String TEXT = "Lesson11/src/task3/text.txt";

    public static void main(String[] args) {
        String text = null;
        try {
            text = Files.readString(Path.of(TEXT));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] blacklist = null;
        try {
            blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!TextFormatter.hasBlacklistWordInString(text, blacklist)) {
            System.out.println("В тексте не встечаются слова из чёрного списка.");
            return;
        } else {
            System.out.println("В тексте обнаружены слова из чёрного списка.\nПредложения, подлежащие исправлению:");
        }
        List<String> sentences = TextFormatter.getSentencesFromText(text);
        int sentencesWithBLWords = 0;
        for (String sentence : sentences) {
            if (TextFormatter.hasBlacklistWordInString(sentence, blacklist)) {
                System.out.println(sentence);
                sentencesWithBLWords++;
            }
        }
        System.out.println("Всего предложений, подлежащих исправлению: " + sentencesWithBLWords);
    }
}
