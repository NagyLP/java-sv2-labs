package kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();
    private final int FIGHTING_ABILITY_HITPOINT_GAP = 25;

    public Army() {
        this.militaryUnits = militaryUnits;
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
//        List<MilitaryUnit> temp = new ArrayList<>();
        for (MilitaryUnit militaryUnit : militaryUnits) {
            militaryUnit.sufferDamage(damage);
//            if (militaryUnit.getHitPoints() < FIGHTING_ABILITY_HITPOINT_GAP) {
//                temp.add(militaryUnit);
        }
        militaryUnits = militaryUnits.stream()
                .filter(militaryUnit -> militaryUnit.getHitPoints() >= FIGHTING_ABILITY_HITPOINT_GAP)
                .collect(Collectors.toList());
    }
//        militaryUnits.removeAll(temp);

    public int getArmyDamage() {
        int armyDamage = 0;
        for (MilitaryUnit militaryUnit : militaryUnits) {
            armyDamage += militaryUnit.doDamage();
        }
        return armyDamage;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}
