package localvariables;

public class Distance {

    private final double distancelnKM;
    private final boolean exacT;

    public Distance (double distancelnKM, boolean exact) {
        this.distancelnKM = distancelnKM;
        this.exacT = exact;
    }

    public double getDistancelnKM() {return distancelnKM;}
    public boolean isExact() {return exacT;}


}
