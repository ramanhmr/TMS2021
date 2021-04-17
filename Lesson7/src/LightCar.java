import lombok.Getter;

@Getter
public class LightCar extends LandTransport implements DescribedTransport {
    private String bodyType;
    private int numberOfPassengers;

    public LightCar(double power, double maxSpeed, double mass, String brand, int numberOfWheels,
                    double fuelConsumptionPer100km, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, mass, brand, numberOfWheels, fuelConsumptionPer100km);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String description() {
        return "Это " + this.getNumberOfWheels() + " колёсный" + this.getBodyType() + " марки " + this.getBrand() +
                ". Вместительность - " + this.getNumberOfPassengers() + " человек. При весе " + this.getMass() +
                " кг данное транспортное средство может развивать скорость до " + this.getMaxSpeed() +
                " км/ч при среднем расходе топлива " + this.getFuelConsumptionPer100km() + " л/км. Мощность составляет "
                + this.getPower() + " лошадиных сил или " + this.getPowerInkW() + " кВт.";
    }

    public String describeFuelConsumptionInTime(double time) {
        return "За время " + doubleFormat(time) + " ч, автомобиль " + this.getBrand() +
                ", двигаясь с максимальной скоростью" + this.getMaxSpeed() + " км/ч, проедет " +
                doubleFormat(distanceCoveredInTime(time)) + "км и израсходует " + doubleFormat(fuelConsumedInTime(time))
                + " л топлива.";
    }

    private double distanceCoveredInTime(double timeInHours) {
        return timeInHours * this.getMaxSpeed();
    }

    private double fuelConsumedInTime(double timeInHours) {
        return distanceCoveredInTime(timeInHours) * (this.getFuelConsumptionPer100km() / 100);
    }

    private String doubleFormat(double number) {
        if (number == (long) number) {
            return String.format("%d", (long) number);
        } else {
            return String.format("%s", number);
        }
    }
}
