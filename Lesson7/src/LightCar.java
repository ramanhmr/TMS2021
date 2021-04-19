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
        return "Это " + getNumberOfWheels() + " колёсный" + getBodyType() + " марки " + getBrand() +
                ". Вместительность - " + getNumberOfPassengers() + " человек. При весе " + getMass() +
                " кг данное транспортное средство может развивать скорость до " + getMaxSpeed() +
                " км/ч при среднем расходе топлива " + getFuelConsumptionPer100km() + " л/км. Мощность составляет "
                + getPower() + " лошадиных сил или " + getPowerInkW() + " кВт.";
    }

    public String describeFuelConsumptionInTime(double time) {
        return "За время " + doubleFormat(time) + " ч, автомобиль " + getBrand() +
                ", двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет " +
                doubleFormat(distanceCoveredInTime(time)) + "км и израсходует " + doubleFormat(fuelConsumedInTime(time))
                + " л топлива.";
    }

    private double distanceCoveredInTime(double timeInHours) {
        return timeInHours * this.getMaxSpeed();
    }

    private double fuelConsumedInTime(double timeInHours) {
        return distanceCoveredInTime(timeInHours) * (getFuelConsumptionPer100km() / 100);
    }

    private String doubleFormat(double number) {
        if (number == (long) number) {
            return String.format("%d", (long) number);
        } else {
            return String.format("%s", number);
        }
    }
}
