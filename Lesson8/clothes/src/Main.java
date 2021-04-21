import clothes.Person;
import clothes.PersonFactory;

public class Main {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        Person[] people = new Person[4];
        for (int i = 0; i < people.length; i++) {
            people[i] = personFactory.createPerson();
        }
        System.out.println("Выходим на улицу\n");
        for (Person person : people) {
            person.getDressed();
            System.out.println();
        }
        System.out.println("Возвращаемся домой\n");
        for (Person person : people) {
            person.undress();
            System.out.println();
        }
    }
}
