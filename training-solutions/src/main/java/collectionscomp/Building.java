package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private final String address;
    private final int area;
    private final int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return "Building{" +
                "levels=" + levels +
                '}';
    }

    @Override
    public int compareTo(Building other) {
        return Integer.compare(levels, other.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Los Santos köz", 111, 1));
        buildings.add(new Building("Sunset blvrd.", 9999, 99));
        buildings.add(new Building("Kossth L. utca 55.", 5, 5));

        System.out.println(buildings);
    }
}
