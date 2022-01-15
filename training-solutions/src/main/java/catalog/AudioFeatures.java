package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private final List<String> composers;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        this(title, length, performers, new ArrayList<>());
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composers) {
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composers = composers;
        validateInitialization();
    }

    @Override
    public List<String> getContributors() {
        List<String> getCResult = new ArrayList<>();
        getCResult.addAll(composers);
        getCResult.addAll(performers);
        return getCResult;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void validateInitialization() {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title is empty, or null. Error data: " + title);
        }
        if (length <= 0.0) {
            throw new IllegalArgumentException("Length is zero, or negativ. Error data: " + length);
        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException
                    ("Performers is empty, or null. Error data: " + performers);
        }
        if (composers == null) {
            throw new IllegalArgumentException
                    ("Composers is null. Error data: " + composers);
        }
    }
}
