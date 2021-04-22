import lombok.SneakyThrows;

public class Spaceport {
    @SneakyThrows
    public void launch(IStart rocket) {
        if (!rocket.check()) {
            System.out.println("Предстартовая проверка провалена");
            return;
        }
        rocket.ignition();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        rocket.start();
    }
}
