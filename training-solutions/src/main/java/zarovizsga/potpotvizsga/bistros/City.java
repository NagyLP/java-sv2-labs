package zarovizsga.potpotvizsga.bistros;

import java.util.ArrayList;
import java.util.Comparator;
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
        return bistros.stream()
                .filter(bistro -> bistro.getAddress().equals(address))
                .findFirst().orElseThrow(
                        () -> new IllegalArgumentException("Not find Bistro! Adress: " + address));
    }

    public Bistro findLongestMenu() {
        return bistros.stream()
                .sorted(Comparator.comparingInt((Bistro bistro) -> bistro.getMenu().size()).reversed())
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Not find menu! Bistros: " + bistros));
    }

    public List<Bistro> findBistroWithMenuItem(String menuItem) {
        return bistros.stream()
                .filter(bistro -> bistro.
                        .toList();
    }
}
