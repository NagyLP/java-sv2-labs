package linebreak;

import java.time.LocalTime;

public class Car {
        public String getBrandAndTypeInSperarateLines(String brand, String type) {
            return brand +"\n"+ type ;}

    public static void main(String[] args) {
            Car car = new Car();
            System.out.println(car.getBrandAndTypeInSperarateLines("Aston Martin", "Heritage"));
    }
}
