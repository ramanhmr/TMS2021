import lombok.*;

@Getter
@RequiredArgsConstructor
@ToString

public class Person {

    private String name;
    private int age;
    private Boolean sexMale;
    Address address;

    public Person(String name, int age, Boolean sexMale, String country, String city) {
        this.name = name;
        this.age = age;
        this.sexMale = sexMale;
        this.address = new Address(country, city);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class Address {
        private String country;
        private String city;
    }
}
