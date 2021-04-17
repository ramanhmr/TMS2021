import lombok.Getter;

@Getter
public class PassengerAirTransport extends AirTransport implements DescribedTransport {
    private int maxNumberOfPassengers;
    private boolean hasBusinessClass;

    public PassengerAirTransport(double power, double maxSpeed, double mass, String brand, double wingsSpan, double minRunwayLength, int numberOfPassengers, boolean hasBusinessClass) {
        super(power, maxSpeed, mass, brand, wingsSpan, minRunwayLength);
        this.maxNumberOfPassengers = numberOfPassengers;
        this.hasBusinessClass = hasBusinessClass;
    }

    @Override
    public String description() {
        String result = "Это пассажирский самолёт марки " + this.getBrand() + " с размахом крыльев " +
                this.getWingsSpan() + " м. Минимальная требуемая длинна взлетно-посадочной полосы - " +
                this.getMinRunwayLength() + ". Этот самолет может вместить в себя " + this.getMaxNumberOfPassengers() +
                " человек. При весе " + this.getMass() + " кг данное транспортное средство может развивать скорость до "
                + this.getMaxSpeed() + " км/ч. Мощность составляет " + this.getPower() + " лошадиных сил или " +
                this.getPowerInkW() + " кВт.";
        if (hasBusinessClass) {
            result += " В этом самолёте имеются места для пассажиров бизнес класса.";
        } else {
            result += " В этом самолёте не предусмотрены места для пассажиров бизнес класса.";
        }
        return result;
    }

    public boolean canTakePassengers(int numberOfPassengers) {
        return numberOfPassengers < this.getMaxNumberOfPassengers();
    }

    public String canHandlePassengers(int numberOfPassengers) {
        if (canTakePassengers(numberOfPassengers)) {
            return "Пассажиры были посажены в самолёт";
        } else {
            return "Вам нужен самолёт побольше";
        }
    }
}
