public class Main {
    public static void main(String[] args) {
        CargoLandTransport truck1 = new CargoLandTransport(220, 175, 6438, "MAN", 4, 19.49, 5.552);
        LightCar car1 = new LightCar(60, 157, 1525, "Skoda", 4, 6.9, "Hatchback", 5);
        PassengerAirTransport plane1 = new PassengerAirTransport(15700, 629.68, 79000, "Boeing", 28.35, 1510, 189, true);
        MilitaryAirTransport aircraft1 = new MilitaryAirTransport(1720, 410, 6360, "ИЛ", 14.6, 335, false, 4);
        DescribedTransport[] vehicles = {truck1, car1, plane1, aircraft1};
        for (DescribedTransport vehicle : vehicles) {
            System.out.println(vehicle.description());
        }
        System.out.println(car1.describeFuelConsumptionInTime(7));
        System.out.println(truck1.canHandleWeight(6));
        System.out.println(plane1.canHandlePassengers(170));
        System.out.println(aircraft1.eject());
        for (int i = 0; i < 5; i++) {
            System.out.println(aircraft1.missileShot());
        }
    }
}
