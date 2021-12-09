package methodstructure.bmi;

import static methodstructure.bmi.BmiCategory.*;

public class BodyMass {

    private final double weight;
    private final double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getBodyMassIndex() {
        return weight / (height * height);
    }

    public BmiCategory getBody() {
        double bmi = getBodyMassIndex();
        BmiCategory[] bmiCat = BmiCategory.values();
        if (bmi < bmiCat[0].getLimit())
            return UNDERWEIGHT;
        if (bmi > OVERWEIGHT.getLimit()) {
            return OVERWEIGHT;
        }
        return NORMAL;
    }

    public boolean isThinnerThan(BodyMass other) {
        return getBodyMassIndex() < other.getBodyMassIndex();
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
