import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString

public class Person {

    private String name;
    private int age;
    private String sex;
    private Address address;

    static final String MALE = "male";
    static final String FEMALE = "female";

    public Person(String name, int age, String sex, String city, String country) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = new Address(city, country);
    }

    public Person(String name, int age, String sex, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = new Address(city);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class Address {
        private String COUNTRY = "Belarus";
        private String city;

        public Address(String city) {
            this.city = city;
        }
    }
}
