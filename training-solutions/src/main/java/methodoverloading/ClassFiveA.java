package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private final List<String> classRegister = Arrays.asList("Para Zita", "Jó Áron", "Mekk Elek", "Halom Virág");

    public String getTodayReferringStudent(int number) {
        return classRegister.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return classRegister.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        return classRegister.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }
}
