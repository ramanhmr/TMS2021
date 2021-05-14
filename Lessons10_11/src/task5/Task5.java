package task5;


import java.io.File;


public class Task5 {
    private static final String FILE_NAME = "Lessons10_11\\src\\task5\\car.json";

    public static void main(String[] args) {
        Car car = new Car("Toyota", 230, 35000);
        File file = new File(FILE_NAME);
        ObjJsonInteract.writeObjToJson(file, car);
        Car carFromJson = ObjJsonInteract.readObjFormJson(file, Car.class);
        System.out.println(carFromJson);
    }


}
