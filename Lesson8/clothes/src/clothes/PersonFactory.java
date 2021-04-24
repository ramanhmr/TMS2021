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
    private static int continuousSeed;

    public Person createPerson() {
        int numberOfName = continuousSeed % Names.values().length;
        String personName = Names.values()[numberOfName].toString();
        Person result = new Person(personName, choseBodyWear(continuousSeed), choseLegWear(continuousSeed), choseFootWear(continuousSeed));
        continuousSeed++;
        return result;
    }

    public Person createPerson(int randomSeed) {
        int numberOfName = randomSeed % Names.values().length;
        String personName = Names.values()[numberOfName].toString();
        return new Person(personName, choseBodyWear(randomSeed), choseLegWear(randomSeed), choseFootWear(randomSeed));
    }

    private BodyWear choseBodyWear(int itemChoice) {
        return switch (itemChoice % BodyWear.TYPES) {
            case 0 -> new Jacket();
            case 1 -> new Slicker();
            default -> throw new IllegalStateException("Unexpected value: " + itemChoice % BodyWear.TYPES);
        };
    }

    private LegWear choseLegWear(int itemChoice) {
        return switch (itemChoice % LegWear.TYPES) {
            case 0 -> new Jeans();
            case 1 -> new Kilt();
            case 2 -> new Shorts();
            default -> throw new IllegalStateException("Unexpected value: " + itemChoice % LegWear.TYPES);
        };
    }

    private FootWear choseFootWear(int itemChoice) {
        return switch (itemChoice % FootWear.TYPES) {
            case 0 -> new Boots();
            case 1 -> new Gumshoes();
            case 2 -> new Slippers();
            case 3 -> new Sneakers();
            default -> throw new IllegalStateException("Unexpected value: " + itemChoice % FootWear.TYPES);
        };
    }
}
