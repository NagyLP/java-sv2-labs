package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {

    private final List<String> authors;
    private final int numberOfPages;
    private final String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
        validateInitialization();
    }

    @Override
    public List<String> getContributors() {
        List<String> getCResult = new ArrayList<>();
        getCResult.addAll(authors);
        return getCResult;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void validateInitialization() {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages <= 0.0) {
            throw new IllegalArgumentException("Number of pages is zero, or negativ. Error data: " + numberOfPages);
        }
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException
                    ("Authors is empty, or null. Error data: " + authors);
        }
    }
}
