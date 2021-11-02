package stringconcat.emloyee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Kék Imi","Billentyűzet-koptató", 1_000_000);

        System.out.println(employee.getName());
        System.out.println(employee.getProfession());
        System.out.println(employee.getSalary()+"\n");

        System.out.println(employee.toString());
    }
}
