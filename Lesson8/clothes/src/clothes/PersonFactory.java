package clothes;

import clothes.bodyWear.BodyWear;
import clothes.bodyWear.Jacket;
import clothes.bodyWear.Slicker;
import clothes.footWear.*;
import clothes.legWear.Jeans;
import clothes.legWear.Kilt;
import clothes.legWear.LegWear;
import clothes.legWear.Shorts;

public class PersonFactory {
    private static int body;
    private static int leg;
    private static int foot;
    private static int name;

    public Person createPerson() {
        BodyWear bodyWear;
        switch (body % BodyWear.TYPES) {
            case 0:
                bodyWear = new Jacket();
                break;
            case 1:
                bodyWear = new Slicker();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + body % BodyWear.TYPES);
        }
        body++;
        LegWear legWear;
        switch (leg % LegWear.TYPES) {
            case 0:
                legWear = new Jeans();
                break;
            case 1:
                legWear = new Kilt();
                break;
            case 2:
                legWear = new Shorts();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + leg % LegWear.TYPES);
        }
        leg++;
        FootWear footWear;
        switch (foot % FootWear.TYPES) {
            case 0:
                footWear = new Boots();
                break;
            case 1:
                footWear = new Gumshoes();
                break;
            case 2:
                footWear = new Slippers();
                break;
            case 3:
                footWear = new Sneakers();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + foot % FootWear.TYPES);
        }
        foot++;
        int numberOfName = name % Names.values().length;
        String personName = Names.values()[numberOfName].toString();
        return new Person(personName, bodyWear, legWear, footWear);
    }
}
