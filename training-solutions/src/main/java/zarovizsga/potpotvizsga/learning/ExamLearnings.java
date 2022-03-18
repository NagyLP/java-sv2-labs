package zarovizsga.potpotvizsga.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExamLearnings {

    private final Map<String, Double> learnings = new HashMap<>();

    public Map<String, Double> getLearnings() {
        return new HashMap<>(learnings);
    }

    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            while (br.ready()) {
                addLearningsFromLine(br.readLine());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file.", ioe);
        }
    }

    private void addLearningsFromLine(String line) {
        String[] elements = line.split(";");
        String[] times = Arrays.copyOfRange(elements, 1, elements.length);
        learnings.put(elements[0], learningTimeFormatter(times));
    }

    private double learningTimeFormatter(String... times) {
//        return learnings.values().stream()
//                .mapToDouble(i -> (Double.parseDouble(i.toString().replace(',', '.')))*60)
//                .sum();
        int minutes = 0;
        for (String item : times) {
            minutes += Double.parseDouble(
                    item.replace(',', '.'))
                    * 60;
        }
        return minutes;
    }

    public double getAverageLearningInMinutes() {
        return learnings.values().stream()
                .mapToDouble(time -> time)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("There are no learning times."));
    }
}
