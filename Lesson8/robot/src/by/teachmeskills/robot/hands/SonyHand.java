package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.abs.RobotParts;

public class SonyHand extends RobotParts implements IHand {

    public SonyHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}