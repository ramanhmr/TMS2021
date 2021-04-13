import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@AllArgsConstructor

public class MilitaryOffice {

    private ArrayList<Person> personRegistry;

    //  a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//  T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//  (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
    public void namesOfFFS() {
        boolean hasNeeded;
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() < 27 && person.getSexMale() == true) {
                System.out.print(person.getName() + ", ");
                hasNeeded = true;
            }
        }
        if (hasNeeded = true) {
            System.out.print("\b\b\n");
        } else {
            System.out.println("Годные к службе призывники отсутствуют.");
        }
    }

    //    б) вывести количество годных призывников в городе Минске.
//    Метод выводит количество годных призывников в введенном городе city
    public int numberOfFFS(String city) {
        int fitForService = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() < 27 && person.getSexMale() == true && person.address.getCity().equals(city)) {
                fitForService++;
            }
        }
        return fitForService;
    }

    //    в) вывести количество призывников от 25 до 27 лет
//    Метод выводит количество призывников в возрасте от lowerEnd (>=) до upperEnd (<)
    public int inAge(int lowerEnd, int upperEnd) {
        int inAge = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= lowerEnd && person.getAge() < upperEnd && person.getSexMale() == true) {
                inAge++;
            }
        }
        return inAge;
    }

    //    г) вывести количество призывников у которых имя Александр.
//    метод выводит количество призывников с именем name
    public int hasName(String name) {
        int hasName = 0;
        for (Person person : personRegistry) {
            if (person.getName().equals(name) && person.getSexMale() == true) {
                hasName++;
            }
        }
        return hasName;
    }
}
