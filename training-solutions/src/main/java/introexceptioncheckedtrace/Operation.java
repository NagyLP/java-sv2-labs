package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operation {

    public List<String> readFile() throws IOException {
        Path pathUnderground = Paths.get("src/main/resources/underground.txt");
        List<String> underground = Files.readAllLines(pathUnderground);
        return underground;
    }

    public String getDailySchedule(List<String> readFile) {
        StringBuilder sb = new StringBuilder(LocalDate.now().toString());
        sb.append(": ");
        for (String item : readFile) {
            if (item.startsWith("2")) {
                sb.append(item + ", ");
            }
        }
        return sb.toString();
    }
}
