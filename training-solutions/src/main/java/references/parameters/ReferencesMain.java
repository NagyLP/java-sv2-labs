package references.parameters;

import java.time.LocalDateTime;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = new Person("Keksz Elek", 100);
        Person person2 = new Person("Jani Béla", 50);

        person2 = person1;
        System.out.println(person1.getName() + ", " + person1.getAge());
        System.out.println(person2.getName() + ", " + person2.getAge());

        person2.setName("Para Zita");
        System.out.println(person1.getName() + ", " + person1.getAge());
        System.out.println(person2.getName() + ", " + person2.getAge());

    int oneInteger;
    int twoInteger;
    oneInteger = 24;
    twoInteger = oneInteger;

    twoInteger += 1;
    System.out.println(oneInteger+" ; "+twoInteger);

    person2 = new Person("Mili Cili", 20);

        System.out.println(person1.getName()+" ; "+person1.getAge());
        System.out.println(person2.getName()+" ; "+person2.getAge());

    }
}
