package by.teachmeskills.robot.heads;

import by.teachmeskills.robot.abs.RobotParts;

public class SonyHead extends RobotParts implements IHead {

    public SonyHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
