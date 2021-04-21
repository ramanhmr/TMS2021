package clothes.footWear;

import clothes.Status;

public class Sneakers implements FootWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Красовки надеты");
        } else {
            System.out.println("Вы уже надели красовки");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Красовки сняты");
        } else {
            System.out.println("На вас не были надеты красовки");
        }
    }
}
