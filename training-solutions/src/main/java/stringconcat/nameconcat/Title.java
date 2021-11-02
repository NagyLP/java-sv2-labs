package stringconcat.nameconcat;

public enum Title {

    TITLE("title"), MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    private final String titleValue;

    Title(String titleValue) {this.titleValue = titleValue;}

    public String getTitle() {return titleValue;}
}
