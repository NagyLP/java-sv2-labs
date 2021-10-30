package enumtype.firstenum.position;

public enum Position {

    IGAZGATÓ(1_000_000, "A minden"), MANAGER(750_000, "Félig minden"), CSOPORTVEZETŐ(500_000, "Félig semmi"), DOLGOZÓ(-2_250_000, "1,5 minden, és 1/2-ig semmi megfizetését követően, \"A na még mit nem.\"");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {return salary;}
    public String getBenefit() {return benefit;}
}
