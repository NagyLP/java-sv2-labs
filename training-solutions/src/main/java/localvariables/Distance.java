package localvariables;

public class Distance {

    private double distancelnKM;
    private boolean exacT;

    public Distance (double distancelnKM, boolean exact) {
        this.distancelnKM = distancelnKM;
        this.exacT = exact;
    }

    public double getDistancelnKM() {return distancelnKM;}
    public boolean isExact() {return exacT;}


}
