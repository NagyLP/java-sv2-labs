package controlselection.greetings;

import statements.Time;

import java.time.LocalTime;

public class Greetings {

     public String greetings (int hours, int minutes) {
        LocalTime time = LocalTime.of(hours, minutes);
        if (time.isBefore(LocalTime.of(5, 0)) | time.isAfter(LocalTime.of(20, 0))) {
            return "Jó éjt!";
        } else if (time.isBefore(LocalTime.of(9, 0))) {
            return "Jó reggelt!";
        } else if (time.isBefore(LocalTime.of(18, 30))) {
            return "Jó napot!";
        } else {
            return "Jó estét!";
        }
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greetings(4, 59));
    }
}
