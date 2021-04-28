package task34;

import java.util.ArrayList;
import java.util.List;

public abstract class TextFormatter {
    static int countWords(String string) {
        return identifyWords(string).size();
    }

    static boolean hasPalindrome(String string) {
        for (String word : identifyWords(string)) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> identifyWords(String string) {
        List<String> words = new ArrayList<>();
        boolean inWord = false;
        int wordStart = -1;
        int wordEnd;
        for (int i = 0; i < string.length(); i++) {
            if (!inWord && Character.isLetterOrDigit(string.charAt(i))) {
                inWord = true;
                wordStart = i;
            } else if (inWord && (Character.isSpaceChar(string.charAt(i)) || i == string.length() - 1)) {
                inWord = false;
                wordEnd = i - 1;
                while (wordEnd >= wordStart) {
                    if (Character.isLetterOrDigit(string.charAt(wordEnd))) {
                        words.add(string.substring(wordStart, wordEnd + 1));
                        break;
                    } else {
                        wordEnd--;
                    }
                }
            }
        }
        return words;
    }

    static boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        for (int i = 0; i < (string.length() / 2); i++) {
            char opposite = string.charAt(string.length() - i - 1);
            if ((Character.toLowerCase(string.charAt(i)) != opposite) && (Character.toUpperCase(string.charAt(i)) != opposite)) {
                return false;
            }
        }
        return true;
    }
}
