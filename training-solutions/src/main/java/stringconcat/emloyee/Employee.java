package stringconcat.emloyee;

public class Employee {

    private String name;
    private String profession;
    private int salary;

    public Employee(String name, String profession, int salary) {
        this.name = name;
        this.profession=profession;
        this.salary = salary;
    }

    public String toString() {
        return name +" - "+ profession+ " - " +salary+ " Ft";
    }

    public String getName() {return name;}

    public String getProfession() {return profession;}

    public int getSalary() {return salary;}
}
