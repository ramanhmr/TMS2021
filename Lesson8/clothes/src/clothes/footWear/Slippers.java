package clothes.footWear;

import clothes.Status;

public class Slippers implements FootWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Тапки надеты");
        } else {
            System.out.println("Вы уже надели тапки");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Тапки сняты");
        } else {
            System.out.println("На вас не были надеты тапки");
        }
    }
}
