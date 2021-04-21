package clothes.legWear;

import clothes.Status;

public class Kilt implements LegWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Килт надет");
        } else {
            System.out.println("Вы уже надели килт");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Килт снят");
        } else {
            System.out.println("На вас не был надет килт");
        }
    }
}