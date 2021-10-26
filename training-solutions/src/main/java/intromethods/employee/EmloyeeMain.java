package intromethods.employee;

public class EmloyeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Cserepes Virág", 2020,1_000_000);
        Employee employee2 = new Employee("Jó Áron", 1990,500_000);
        Employee employee3 = new Employee("Jean d'Arc", 1428,1);

        System.out.println("\n"+employee1+"\n"+employee2+"\n"+employee3);

        employee1.setName("Para Zita");
        System.out.println(employee1.getName()+", "+employee1.getSalary());
        employee1.raiseSalary(1_000_000);

        System.out.println("\n"+employee1+"\n"+employee1.getSalary());
    }
}
