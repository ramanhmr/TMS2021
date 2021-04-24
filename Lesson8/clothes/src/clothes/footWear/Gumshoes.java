package clothes.footWear;

import clothes.Status;

public class Gumshoes implements FootWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Кеды надеты");
        } else {
            System.out.println("Вы уже надели кеды");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Кеды сняты");
        } else {
            System.out.println("На вас не были надеты кеды");
        }
    }
}
