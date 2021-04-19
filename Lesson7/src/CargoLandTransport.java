import lombok.Getter;

@Getter
public class CargoLandTransport extends LandTransport implements DescribedTransport {
    private double maxPayload;

    public CargoLandTransport(double power, double maxSpeed, double mass, String brand, int numberOfWheels,
                              double fuelConsumptionPer100km, double maxPayload) {
        super(power, maxSpeed, mass, brand, numberOfWheels, fuelConsumptionPer100km);
        this.maxPayload = maxPayload;
    }

    @Override
    public String description() {
        return "Это " + getNumberOfWheels() + " колёсный грузовик марки " + getBrand() + ". Грузоподъёмность - "
                + getMaxPayload() + " т. При весе " + getMass() +
                " кг данное транспортное средство может развивать скорость до " + getMaxSpeed() +
                " км/ч при среднем расходе топлива " + getFuelConsumptionPer100km() + " л/км. Мощность составляет "
                + getPower() + " лошадиных сил или " + getPowerInkW() + " кВт.";
    }

    private boolean canCarryWeight(double weight) {
        return weight < maxPayload;
    }

    public String canHandleWeight(double cargoWeight) {
        if (canCarryWeight(cargoWeight)) {
            return "Грузовик загружен";
        } else {
            return "Вам нужен грузовик побольше";
        }
    }
}
