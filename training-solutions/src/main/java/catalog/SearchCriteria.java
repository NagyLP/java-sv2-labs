package catalog;

public class SearchCriteria {

    private final String contributor;
    private final String title;

    public static SearchCriteria createByBoth(String title, String contributor) {
        validateTitle(title);
        validateContributor(contributor);
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        validateContributor(contributor);
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title) {
        validateTitle(title);
        return new SearchCriteria(null, title);
    }

    public boolean hasContributor() {
        return contributor != null;
    }

    public boolean hasTitle() {
        return title != null;
    }

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    private static void validateContributor(String contributor) {
        if (Validators.isBlank(contributor)) throw new IllegalArgumentException
                ("Contributor is null, or empty. Error data: " + contributor);
    }

    private static void validateTitle(String title) {
        if (Validators.isBlank(title)) throw new IllegalArgumentException
                ("Title is null, or empty. Error data: " + title);
    }
}
