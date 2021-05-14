package task34;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public abstract class TextFormatter {
    private static List<String> identifyWords(String string) {
        return Pattern.compile("[\\wа-яА-Я]+").matcher(string).results().map(MatchResult::group).collect(Collectors.toList());
    }

    static boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(string);
        return string.equalsIgnoreCase(sb.reverse().toString());
    }

    static int countWords(String string) {
        return identifyWords(string).size();
    }

    static List<String> getPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>(strings);
        for (String string : strings) {
            if (!TextFormatter.isPalindrome(string)) {
                result.remove(string);
            }
        }
        return result;
    }

    static boolean hasPalindrome(String string) {
        for (String word : identifyWords(string)) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }
}
