package task34;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class FileOperator {
    static ArrayList<String> readFile(File file) {
        ArrayList<String> result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            result = (ArrayList<String>) reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    static void createFile(List<String> strings, String file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String string : strings) {
                writer.append(string).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
