package collectionsequalshash;

import java.util.Objects;

public class Person {

    private final String name;
    private final int age;
    private final String ssn;

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.ssn, ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 5, "111111110");
        Person anotherPerson = new Person("Jane Doe", 55, "111111110");

        System.out.println(person.equals(anotherPerson));
        System.out.println(anotherPerson.equals(person));

        System.out.println(person.hashCode());
        System.out.println(anotherPerson.hashCode());
    }
}
