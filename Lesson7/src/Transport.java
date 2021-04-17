import lombok.Getter;

@Getter
public class Transport {
    private double power;
    private double maxSpeed;
    private double mass;
    private String brand;

    public Transport(double power, double maxSpeed, double mass, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    double getPowerInkW() {
        return power * 0.74;
    }
}

