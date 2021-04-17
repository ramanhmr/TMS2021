import lombok.Getter;

@Getter
public class MilitaryAirTransport extends AirTransport implements DescribedTransport {
    private boolean hasEjectionSystem;
    int numberOfMissiles;

    public MilitaryAirTransport(double power, double maxSpeed, double mass, String brand, double wingsSpan, double minRunwayLength, boolean hasEjectionSystem, int numberOfMissiles) {
        super(power, maxSpeed, mass, brand, wingsSpan, minRunwayLength);
        this.hasEjectionSystem = hasEjectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public String description() {
        String result = "Это боевой самолёт марки " + this.getBrand() + " с размахом крыльев " + this.getWingsSpan() +
                " м. Минимальная требуемая длинна взлетно-посадочной полосы - " + this.getMinRunwayLength() +
                ". Число ракет - " + this.getNumberOfMissiles() + ". При весе " + this.getMass() +
                " кг данное транспортное средство может развивать скорость до " + this.getMaxSpeed() +
                " км/ч. Мощность составляет " + this.getPower() + " лошадиных сил или " + this.getPowerInkW() +
                " кВт. В конструкцию самолёта ";
        if (hasEjectionSystem) {
            result += "включена система катапультирования пилота.";
        } else {
            result += "не включена система катапультирования пилота.";
        }
        return result;
    }

    public String eject() {
        if (this.hasEjectionSystem) {
            return "Катапультирование прошло успешно";
        } else {
            return "У вас нет такой системы";
        }
    }

    public String missileShot() {
        if (numberOfMissiles > 0) {
            numberOfMissiles--;
            return "Ракета пошла...";
        } else {
            return "Боеприпасы отсутствуют";
        }
    }
}
