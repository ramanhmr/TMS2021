package car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Honda", 230, 40000),
                new Car("Toyota", 220, 38000),
                new Car("Skoda", 190, 25000)};
        for (Car car : cars) {
            try {
                car.start();
            } catch (FailedToStartException e) {
                System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
            }
        }
    }

}
