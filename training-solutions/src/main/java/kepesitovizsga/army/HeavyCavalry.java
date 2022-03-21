package kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean heavyCavalyraCharge;

    public HeavyCavalry() {
        super(150, 20, true);
        heavyCavalyraCharge = true;
    }

    @Override
    public int doDamage() {
        int damage = super.doDamage();
        if (heavyCavalyraCharge) {
            damage *= 3;
            heavyCavalyraCharge = false;
        }
        return damage;
    }
}
