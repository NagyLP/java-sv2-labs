package A_Training.workshours;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WorkHours {

    public String minWork(String file) {
        try {
            List<String> lines = Files.readAllLines(Path.of(file));
            return minWorkEmloyee(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String minWorkEmloyee(List<String> lines) {
        int minHours = 24;
        String minWorkEmployeeAndDate = null;

        for (String line : lines) {
            String[] parts = line.split(",");
            String nameOfEmloyee = parts[0];
            int workHours = Integer.parseInt(parts[1]);
            String dateOfWork = parts[2];

            if (minHours > workHours) {
                minHours = workHours;
                minWorkEmployeeAndDate =
                        nameOfEmloyee + ": " + dateOfWork;
            }
        }
        return minWorkEmployeeAndDate;
    }
}
