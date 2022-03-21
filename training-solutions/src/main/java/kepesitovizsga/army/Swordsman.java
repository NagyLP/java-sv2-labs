package kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean protectCharge;

    public Swordsman(boolean armor) {
        super(100, 10, armor);
        protectCharge = true;
    }

    @Override
    public void sufferDamage(int damage) {
        if (protectCharge) {
            protectCharge = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}
