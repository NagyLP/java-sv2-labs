package methodparam.marriage;

import java.util.List;

public class Man {

    private final String name;
    private final List<RegisterDate> registerDates;

    public Man(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }
}
