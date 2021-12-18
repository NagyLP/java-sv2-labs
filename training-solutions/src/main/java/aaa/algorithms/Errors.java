package aaa.algorithms;

public enum Errors {

    ADD_ITEM("Örülünk."),
    ERRORS_UPPER_CASE("Sentence must start with capital!"),
    ERRORS_ENGING_MARK("Sentence must end with ending mark!");

    private final String ERROR_OP;

    Errors(String ERROR_OP) {
        this.ERROR_OP = ERROR_OP;
    }
}
