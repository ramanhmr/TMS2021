package clothes.legWear;

import clothes.Status;

public class Shorts implements LegWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Шорты надеты");
        } else {
            System.out.println("Вы уже надели шорты");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Шорты сняты");
        } else {
            System.out.println("На вас не были надеты шорты");
        }
    }
}
