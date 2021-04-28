package task34;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        File inputFile = new File("S:\\TeachMeSkills\\Files\\TMS2021\\Lesson10\\src\\input.txt");
        List<String> fileContains;
        try {
            fileContains = FileOperator.readFile(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Файл \"input.txt\" отсутствует");
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        fileContains = getPalindromes(fileContains);
        FileOperator.createFile(fileContains, "S:\\TeachMeSkills\\Files\\TMS2021\\Lesson10\\src\\output.txt");
    }

    private static List<String> getPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>(strings);
        for (String string : strings) {
            if (!TextFormatter.isPalindrome(string)) {
                result.remove(string);
            }
        }
        return result;
    }
}
