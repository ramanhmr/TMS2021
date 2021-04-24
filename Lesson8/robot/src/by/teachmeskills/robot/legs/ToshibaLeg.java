package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.abs.RobotParts;

public class ToshibaLeg extends RobotParts implements ILeg {

    public ToshibaLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}