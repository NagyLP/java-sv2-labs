package streamsalgorithms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("employe1", 1910),
                new Employee("employe2", 2020),
                new Employee("employe3", 1967),
                new Employee("employe4", 1955),
                new Employee("employe5", 2014),
                new Employee("employe6", 1945)
        );

        System.out.println("Születési évek összege: " + employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum());
        System.out.println("Életkorok összege: " + employees.stream()
                .mapToInt(employee -> 2022 - employee.getYearOfBirth())
                .sum());
        System.out.println("Alkalmazozzak száma: " + employees.stream()
                .count());
        System.out.println("1990-nél korábban születettek száma: " + employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count());
        System.out.println("Legkorábban született alkalmazott születési éve: " + employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .min()
                .getAsInt());
        System.out.println("legkorábban született alkalmazott neve: " + employees.stream()
                .sorted(Comparator.comparing(Employee::getYearOfBirth))
                .findFirst()
                .get()
                .getName());
        System.out.println("Igaz-e, hogy minden alkalmazott 1980 előtt született? " + employees.stream()
                .filter(employee -> employee.getYearOfBirth() >= 1980)
                .collect(Collectors.toList())
                .isEmpty());
        System.out.println("1990-nél korábban született alkalmazottak: " + employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList()));
        System.out.println("Összes alkalmazott neve: " + employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", ")));
        System.out.println("1990-nél korábban született alkalmazott neve: " + employees.stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .collect(Collectors.joining(", ")));
    }

    private final String name;
    private final int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}