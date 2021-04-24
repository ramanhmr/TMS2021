import java.util.Random;

public class SpaceXBFR implements IStart {

    @Override
    public boolean check() {
        Random generate = new Random();
        return generate.nextBoolean() || generate.nextBoolean();
    }

    @Override
    public void ignition() {
        System.out.println("Двигатели Big Falcon Rocket запущены.\nВсе системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт BFR");
    }
}
