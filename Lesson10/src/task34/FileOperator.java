package task34;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class FileOperator {
    static ArrayList<String> readFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<String> result = (ArrayList<String>) reader.lines().collect(Collectors.toList());
        reader.close();
        return result;
    }

    static void createFile(List<String> strings, String file) {
        FileWriter writer;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Не удалось создать файл");
            return;
        }
        try {
            for (String string : strings) {
                writer.write(string + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи файла");
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("Не удалось закрыть файл");
        }
    }
}
