package clothes.footWear;

import clothes.Status;

public class Boots implements FootWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Сапоги надеты");
        } else {
            System.out.println("Вы уже надели сапоги");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Сапоги сняты");
        } else {
            System.out.println("На вас не были надеты сапоги");
        }
    }
}
