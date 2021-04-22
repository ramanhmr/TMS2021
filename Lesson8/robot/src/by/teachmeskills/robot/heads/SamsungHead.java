package by.teachmeskills.robot.heads;

import by.teachmeskills.robot.abs.RobotParts;

public class SamsungHead extends RobotParts implements IHead {

    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}