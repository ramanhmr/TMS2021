package clothes;

import clothes.bodyWear.BodyWear;
import clothes.footWear.FootWear;
import clothes.legWear.LegWear;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Clothes> clothesList = new ArrayList<>();

    public Person(String name, BodyWear bodyWear, LegWear legWear, FootWear footWear) {
        this.name = name;
        clothesList.add(bodyWear);
        clothesList.add(legWear);
        clothesList.add(footWear);
    }

    public void getDressed() {
        for (Clothes clothes : clothesList) {
            clothes.putOn();
        }
    }

    public void undress() {
        for (Clothes clothes : clothesList) {
            clothes.takeOff();
        }
    }
}
