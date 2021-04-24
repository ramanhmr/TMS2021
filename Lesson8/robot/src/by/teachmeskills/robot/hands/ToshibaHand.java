package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.abs.RobotParts;

public class ToshibaHand extends RobotParts implements IHand {

    public ToshibaHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}