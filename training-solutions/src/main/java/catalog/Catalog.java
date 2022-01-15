package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int minNumber) {
        if (minNumber <= 0) throw new IllegalArgumentException("Page number must be positive");
        int sum = 0;
        int totalItems = 0;
        for (CatalogItem item : catalogItems) {
            int pages = item.numberOfPagesAtOneItem();
            if (pages >= minNumber) {
                totalItems++;
                sum += pages;
            }
        }
        if (totalItems == 0) {
            throw new IllegalArgumentException("No page");
        }
        return (double) sum / totalItems;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        CatalogItem deleteItem = null;
        for (CatalogItem item : catalogItems) {
            if (item.getRegistrationNumber().equals(registrationNumber)) {
                deleteItem = item;
                break;
            }
        }
        if (deleteItem == null) {
            throw new IllegalArgumentException("Item not found - data: " + deleteItem);
        }
        catalogItems.remove(deleteItem);
    }


    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> searchResult = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (criteriaFinderValidator(searchCriteria, item)) {
                searchResult.add(item);
            }
        }
        return searchResult;
    }

    public int getAllPageNumber() {
        int totalPages = 0;
        for (CatalogItem item : catalogItems) {
            totalPages += item.numberOfPagesAtOneItem();
        }
        return totalPages;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                audioItems.add(item);
            }
        }
        return audioItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasPrintedFeature()) {
                printedItems.add(item);
            }
        }
        return printedItems;
    }

    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem item : catalogItems) {
            fullLength += item.fullLengthAtOneItem();
        }
        return fullLength;
    }


    private boolean criteriaFinderValidator(SearchCriteria searchCriteria, CatalogItem catalogItem) {
        if (searchCriteria.hasContributor()
                && !catalogItem.getContributors().contains(searchCriteria.getContributor()))
            return false;
        return !searchCriteria.hasTitle()
                || catalogItem.getTitles().contains(searchCriteria.getTitle());
    }
}
