import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor

public class MilitaryOffice {

    private static final int SERVICE_MIN_AGE = 18;
    private static final int SERVICE_UNTIL_AGE = 27;

    private List<Person> personRegistry;

    //  a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//  T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//  (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
    public List<String> namesOfFitForService() {
        List<String> result = new ArrayList<>();
        for (Person person : personRegistry) {
            if (recruitable(person)) {
                result.add(person.getName());
            }
        }
        return result;
    }

    //    б) вывести количество годных призывников в городе Минске.
//    Метод выводит количество годных призывников в введенном городе city
    public int fitForServiceInCity(String city) {
        int result = 0;
        for (Person person : personRegistry) {
            if (recruitable(person) && person.getAddress().getCity().equals(city)) {
                result++;
            }
        }
        return result;
    }

    //    в) вывести количество призывников от 25 до 27 лет
//    Метод выводит количество призывников в возрасте от lowerEnd (>=) до upperEnd (<)
    public int countRecruitsInAgeRange(int ageFrom, int ageTo) {
        int result = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= ageFrom && person.getAge() < ageTo && person.getSex().equals(Person.MALE)) {
                result++;
            }
        }
        return result;
    }

    //    г) вывести количество призывников у которых имя Александр.
//    метод выводит количество призывников с именем name
    public int countRecruitsWithName(String name) {
        int result = 0;
        for (Person person : personRegistry) {
            if (person.getName().equals(name) && person.getSex().equals(Person.MALE)) {
                result++;
            }
        }
        return result;
    }

    private boolean recruitable(Person person) {
        return person.getAge() >= SERVICE_MIN_AGE && person.getAge() < SERVICE_UNTIL_AGE && person.getSex().equals(Person.MALE);
    }
}
