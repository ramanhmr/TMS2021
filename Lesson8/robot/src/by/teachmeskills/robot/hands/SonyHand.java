package by.teachmeskills.robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
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