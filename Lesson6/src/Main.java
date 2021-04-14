import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Person> people = createPopulationList(100, 10, 40);

//        Вывод всего населения
//        for (Person person : people) {
//            System.out.println(person.getSexMale() + " " + person.getName() + " " + person.getAge() + " " + person.address.getCity());
//        }

        MilitaryOffice militaryOffice = new MilitaryOffice(people);

        System.out.print("Имена годных к службе призывников: ");
        for (Object name : militaryOffice.namesOfFitForService()) {
            System.out.print(name + ", ");
        }
        System.out.println("\b\b");
        System.out.println("В Минске проживают " + militaryOffice.fitForServiceInCity("Минск") + " годных к службе призывников.");
        System.out.println(militaryOffice.countRecruitsInAgeRange(18, 27) + " находятся в возрасте 18-27 лет.");
        System.out.println("Среди призывников у " + militaryOffice.countRecruitsWithName("Александр") + " имя Александр");
    }

    //    генератор списка людей, числом numberOfPeople. Генерирует только Беларусов, мужчин и женщин, имена выбираются
//    случайно, город тоже (Минск встречается в 2 раза чаще, чем другие города), возраст случайный в пределах границ
//    lowerAge(>=) и upperAge(<)
    public static List<Person> createPopulationList(int numberOfPeople, int lowerAge, int upperAge) {
        String[] maleNames = {"Александр", "Дмитрий", "Максим", "Сергей", "Андрей", "Алексей", "Артём", "Илья", "Кирилл", "Михаил"};
        String[] femaleNames = {"Анастасия", "Анна", "Мария", "Елена", "Дарья"};
        String[] cities = {"Брест", "Витебск", "Гомель", "Гродно", "Могилев", "Минск", "Минск"};
        List<Person> populationList = new ArrayList<>();
        Random generate = new Random();
        for (int i = 0; i < numberOfPeople; i++) {
            Person person;
            boolean sexMale = generate.nextBoolean();
            if (sexMale) {
                person = new Person(
                        maleNames[generate.nextInt(10)],
                        generate.nextInt(upperAge - lowerAge) + lowerAge,
                        Person.MALE,
                        cities[generate.nextInt(7)]);
            } else {
                person = new Person(
                        femaleNames[generate.nextInt(5)],
                        generate.nextInt(30) + 10,
                        Person.FEMALE,
                        cities[generate.nextInt(7)]);
            }
            populationList.add(person);
        }
        return populationList;
    }
}
