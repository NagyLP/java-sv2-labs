package methodparam.sums;

public class Sums {

    private final double sumPositives;
    private final double sumNegatives;

    public Sums(double sumPositives, double sumNegatives) {
        this.sumPositives = sumPositives;
        this.sumNegatives = sumNegatives;
    }

    public double getSumPositives() {
        return sumPositives;
    }

    public double getSumNegatives() {
        return sumNegatives;
    }

}
