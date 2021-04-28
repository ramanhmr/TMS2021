package task34;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        File inputFile = new File("S:\\TeachMeSkills\\Files\\TMS2021\\Lesson10\\src\\input4.txt");
        ArrayList<String> fileContains;
        try {
            fileContains = FileOperator.readFile(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Файл \"input.txt\" отсутствует");
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        ArrayList<String> sentences = new ArrayList<>(fileContains);
        for (String string : sentences) {
            int numberOfWords = TextFormatter.countWords(string);
            if (!(TextFormatter.hasPalindrome(string) || (numberOfWords <= 5 && numberOfWords >= 3))) {
                fileContains.remove(string);
            }
        }
        FileOperator.createFile(fileContains, "S:\\TeachMeSkills\\Files\\TMS2021\\Lesson10\\src\\output4.txt");
    }
}
