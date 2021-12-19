package aaa.algorithms;

public enum Errors {

    ADD_ITEM("Örülünk.", null),
    ERRORS_UPPER_CASE("Sentence must start with capital!", new IllegalArgumentException()),
    ERRORS_ENGING_MARK("Sentence must end with ending mark!", new IllegalArgumentException());

    private final String ERROR_TEXT;
    private final Exception EXEPT;

    Errors(String ERROR_OP, Exception EXEPT) {
        this.ERROR_TEXT = ERROR_OP;
        this.EXEPT = EXEPT;
    }

    public String getERROR_TEXT() {
        return ERROR_TEXT;
    }

    public Exception getEXEPT() {
        return EXEPT;
    }
}
