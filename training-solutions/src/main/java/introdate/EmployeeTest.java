package introdate;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a belépő nevét: ");
            String name = sc.nextLine();
        System.out.println("Kérem a év: ");
            int year = sc.nextInt();
        System.out.println("Kérem a hónap: ");
            int month = sc.nextInt();
        System.out.println("Kérem a nap: ");
            int day = sc.nextInt();

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Employee employee = new Employee(year, month, day, name);
            employee.setName(name);

        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth()+"\n");
        System.out.println(employee.getBeginEmployment());
  }
}
