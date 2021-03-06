package tasks45.task4;

import tasks45.Car;

import java.io.*;

public class Task4 {
    private static String FILE = "Lesson11/src/tasks45/task4/car.ser";

    public static void main(String[] args) {
        Car car = new Car("Honda", 250, 40000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE))) {
            carFromFile = (Car) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(carFromFile);
    }
}
