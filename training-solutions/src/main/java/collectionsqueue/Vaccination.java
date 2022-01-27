package collectionsqueue;

import java.util.*;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> vaccinationOrder = new PriorityQueue<>();
        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                vaccinationOrder.add(p.getAge());
            }
        }
        return vaccinationOrder;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (Person person : Arrays.asList(
                new Person("Csevap Csilla", 99),
                new Person("Fodros Virág", 55),
                new Person("Cserepes Virág", 44),
                new Person("Éter Péter ", 11))) {
            people.add(person);
        }

        Vaccination vaccination = new Vaccination();
        Queue<Integer> vaccinationOrder = vaccination.getVaccinationOrder(people);

        System.out.println(vaccinationOrder);
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
    }
}
