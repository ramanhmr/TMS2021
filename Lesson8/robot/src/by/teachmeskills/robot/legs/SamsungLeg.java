package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.abs.RobotParts;

public class SamsungLeg extends RobotParts implements ILeg {

    public SamsungLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}