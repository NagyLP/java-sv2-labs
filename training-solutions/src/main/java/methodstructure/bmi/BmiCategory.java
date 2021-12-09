package methodstructure.bmi;

public enum BmiCategory {

    UNDERWEIGHT(18.5), NORMAL(21.5), OVERWEIGHT(25);

    private final double limit;

    BmiCategory(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }
}
