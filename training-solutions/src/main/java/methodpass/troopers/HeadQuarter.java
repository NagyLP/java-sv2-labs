package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private final List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        moveTrooper(findClosestTrooper(target), target);
    }

    public Trooper findTrooperByName(String name) {
        for (Trooper item : troopers) {
            if (item.getName().equals(name)) ;
            return item;
        }
        throw new IllegalArgumentException(String.format("Can I find trooper by name.", name));
    }

    public Trooper findClosestTrooper(Position target) {
        if (troopers.isEmpty()) {
            throw new IllegalArgumentException("Troopers collection is empty.");
        }
        Trooper closestTrooper = troopers.get(0);
        for (Trooper item : troopers) {
            if (item.distanceFrom(target) < closestTrooper.distanceFrom(target)) {
                closestTrooper = item;
            }
        }
        return closestTrooper;
    }

    public void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }
}
