package zarovizsga.potpotvizsga.bistros;

import java.util.ArrayList;
import java.util.List;

public class City {

    private final List<Bistro> bistros = new ArrayList<>();

    public void addBistro(Bistro bistro) {
        bistros.add(bistro);
    }

    public List<Bistro> getBistros() {
        return bistros;
    }

    public Bistro findBistroByAddress(Address address) {

    }
}
