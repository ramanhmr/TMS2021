package clothes.legWear;

import clothes.Status;

public class Jeans implements LegWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Джинсы надеты");
        } else {
            System.out.println("Вы уже надели джинсы");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Джинсы сняты");
        } else {
            System.out.println("На вас не были надеты джинсы");
        }
    }
}
