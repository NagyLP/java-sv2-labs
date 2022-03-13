package zarovizsga.potpotvizsga.bistros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bistro {

    private final String name;
    private final Address address;
    private final List<MenuItem> menu = new ArrayList<>();

    public Bistro(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bistro bistro = (Bistro) o;
        return name.equals(bistro.name) && address.equals(bistro.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
