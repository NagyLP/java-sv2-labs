package enumtype.firstenum.solarsystem;

public enum SolarSytem {

     JUPITER(79), SZATURNUSZ(62), URÁNUSZ(27), NEPTUNUSZ(14);

     private final int moon;

     SolarSytem(int moon) {this.moon=moon;}

     public int getMoon() {
          return moon;
     }
}
