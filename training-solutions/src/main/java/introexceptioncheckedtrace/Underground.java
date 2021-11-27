package introexceptioncheckedtrace;

import java.io.IOException;

public class Underground {

    public static void main(String[] args) {
//        Operation operation = new Operation();

        try {
            System.out.println(new Operation().getDailySchedule(new Operation().readFile()));
        } catch (IOException ioe) {
            System.out.println("Error while reading...");
        }
    }
}
