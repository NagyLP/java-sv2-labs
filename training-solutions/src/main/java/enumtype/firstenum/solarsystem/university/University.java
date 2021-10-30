package enumtype.firstenum.solarsystem.university;

public enum University {

    BCE("Budapesti Corvinus Egyetem"), BME("Budapesti Műszaki Egyetem"), ELTE("Eötvös Lóránt Tudományegyetem"), DE("Debreceni Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }
    public String getName() {return name;}
}
