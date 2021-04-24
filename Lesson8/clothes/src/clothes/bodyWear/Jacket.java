package clothes.bodyWear;

import clothes.Status;

public class Jacket implements BodyWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Куртка надета");
        } else {
            System.out.println("Вы уже надели куртку");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Куртка снята");
        } else {
            System.out.println("На вас не была надета куртка");
        }
    }
}
