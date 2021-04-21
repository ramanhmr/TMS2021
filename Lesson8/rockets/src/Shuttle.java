import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean check() {
        Random generate = new Random();
        return generate.nextInt(11) > 3;
    }

    @Override
    public void ignition() {
        System.out.println("Двигатели Шатла запущены.\nВсе системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
