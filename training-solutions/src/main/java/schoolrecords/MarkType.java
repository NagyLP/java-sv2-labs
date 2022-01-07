package schoolrecords;

public enum MarkType {

    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private final int markNumeric;
    private final String markText;

    MarkType(int markNumeric, String markText) {
        this.markNumeric = markNumeric;
        this.markText = markText;
    }

    public int getMarkNumeric() {
        return markNumeric;
    }

    public String getMarkText() {
        return markText;
    }
}
