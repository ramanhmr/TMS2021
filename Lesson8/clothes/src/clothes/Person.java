package clothes;

import clothes.bodyWear.BodyWear;
import clothes.footWear.FootWear;
import clothes.legWear.LegWear;

public class Person {
    private String name;
    private BodyWear bodyWear;
    private LegWear legWear;
    private FootWear footWear;

    public Person(String name, BodyWear bodyWear, LegWear legWear, FootWear footWear) {
        this.name = name;
        this.bodyWear = bodyWear;
        this.legWear = legWear;
        this.footWear = footWear;
    }

    public void getDressed() {
        legWear.putOn();
        footWear.putOn();
        bodyWear.putOn();
    }

    public void undress() {
        bodyWear.takeOff();
        footWear.takeOff();
        legWear.takeOff();
    }
}
