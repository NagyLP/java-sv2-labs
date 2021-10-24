package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class PiMain {
    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();

        System.out.println(circleCalculator.calculateArea(40));
        System.out.println(circleCalculator.calculatePerimeter(100));


        CylinderCalculator cylinderCalculator = new CylinderCalculator();

        System.out.println(cylinderCalculator.calculateVolume(40, 20));
        System.out.println(cylinderCalculator.calculateSurfaceArea(40, 40));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(40, 20));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(40, 40));
    }
}
