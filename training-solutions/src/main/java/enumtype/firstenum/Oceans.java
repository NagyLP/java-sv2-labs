package enumtype.firstenum;

public enum Oceans {

    ATLANI_ÓCEÁN("Atlanti-óceán"), JEGES_TENGER("Jeges-tenger"), CSENDES_ÓCEÁN("Csendes-óceán"), INDIAI_ÓCEÁN("Indiai-óceán");

    private final String values;

    Oceans(String values) {
        this.values = values;
    }

    public String getValues() {return values;}
}
