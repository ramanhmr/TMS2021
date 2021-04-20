import lombok.Getter;

@Getter
public class LandTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumptionPer100km;

    public LandTransport(double power, double maxSpeed, double mass, String brand, int numberOfWheels, double fuelConsumptionPer100km) {
        super(power, maxSpeed, mass, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }
}
