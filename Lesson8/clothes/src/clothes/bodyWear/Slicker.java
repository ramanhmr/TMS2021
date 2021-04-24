package clothes.bodyWear;

import clothes.Status;

public class Slicker implements BodyWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Дождевик надет");
        } else {
            System.out.println("Вы уже надели дождевик");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Дождевик снят");
        } else {
            System.out.println("На вас не был надет дождевик");
        }
    }
}
