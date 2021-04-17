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
        return "Это " + this.getNumberOfWheels() + " колёсный грузовик марки " + this.getBrand() +
                ". Грузоподъёмность - " + this.getMaxPayload() + " т. При весе " + this.getMass() +
                " кг данное транспортное средство может развивать скорость до " + this.getMaxSpeed() +
                " км/ч при среднем расходе топлива " + this.getFuelConsumptionPer100km() + " л/км. Мощность составляет "
                + this.getPower() + " лошадиных сил или " + this.getPowerInkW() + " кВт.";
    }

    public boolean canCarryWeight(double weight) {
        return weight < this.maxPayload;
    }

    public String canHandleWeight(double cargoWeight) {
        if (canCarryWeight(cargoWeight)) {
            return "Грузовик загружен";
        } else {
            return "Вам нужен грузовик побольше";
        }
    }
}
