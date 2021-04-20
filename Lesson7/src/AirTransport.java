import lombok.Getter;

@Getter
public class AirTransport extends Transport {
    private double wingsSpan;
    private double minRunwayLength;

    public AirTransport(double power, double maxSpeed, double mass, String brand, double wingsSpan, double minRunwayLength) {
        super(power, maxSpeed, mass, brand);
        this.wingsSpan = wingsSpan;
        this.minRunwayLength = minRunwayLength;
    }
}
