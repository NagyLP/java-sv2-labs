package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private final List<Feature> features;
    private final int price;
    private final String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = Arrays.asList(features);
        validateInitialization();
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature item : features) {
            fullLength += item instanceof AudioFeatures ? ((AudioFeatures) item).getLength() : 0;
        }
        return fullLength;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature item : features) {
            contributors.addAll(item.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature item : features) {
            titles.add(item.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature item : features) {
            if (item instanceof AudioFeatures)
                return true;
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature item : features) {
            if (item instanceof PrintedFeatures)
                return true;
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int totalNumberOfPages = 0;
        for (Feature item : features) {
            totalNumberOfPages += item instanceof PrintedFeatures ? ((PrintedFeatures) item).getNumberOfPages() : 0;
        }
        return totalNumberOfPages;
    }


    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    private void validateInitialization() {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Empty, or null registration number. Error data: " + registrationNumber);
        }
        if (price <= 0.0) {
            throw new IllegalArgumentException("Of curse...Prise is zero, or negativ. Error data: " + price);
        }
        if (features.isEmpty()) {
            throw new IllegalArgumentException
                    ("Features is empty, or null. Error data: " + features);
        }
    }
}
