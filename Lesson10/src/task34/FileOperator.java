package task34;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public final class FileOperator {

    private FileOperator() {
    }

    public static List<String> readFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeDataToFile(List<String> strings, String file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String string : strings) {
                writer.append(string).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
