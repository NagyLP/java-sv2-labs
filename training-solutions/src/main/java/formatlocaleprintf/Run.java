package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {

    private final String TEXT = "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!";
    private String userName;
    private List<Double> kmList;


    public Run(String userName) {
        this.userName = userName;
        this.kmList = new ArrayList<>(Arrays.asList());

    }

    public void addRun(double km) {
        kmList.add(km);
    }

    public String printFormattedRunText() {
        String localDate = LocalDate.now().toString();
        int runNumber = kmList.size();
        double km = kmList.get(kmList.size()-1);
      return String.format(TEXT, userName, localDate, runNumber, km);
    };

    public static void main(String[] args) {
        Run run = new Run("Forrest Gump");
        run.addRun(10.1);
        System.out.println(run.printFormattedRunText());
        run.addRun(12.2);
        run.addRun(13.3);
        run.addRun(14.4);
        System.out.println(run.kmList);
    }
}
