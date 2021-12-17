package aaa.algorithms;

public enum Errors {

    ADD_ITEM("Örülünk Vince."),
    UPPER_CASE_ERROR("Sentence must start with capital!"),
    ENDING_MARK_ERROR("Sentence must end with ending mark!");

    private final String ERROR_TEXT;

    Errors(String ERROR_TEXT) {
        this.ERROR_TEXT = ERROR_TEXT;
    }
}
