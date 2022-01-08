package schoolrecords;

public class Mark {

    private final MarkType markType;
    private final Subject subject;
    private final Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if (markType == null || subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        if (isEmpty(subject, tutor)) {
            throw new IllegalArgumentException("Subject/Tutor must not be empty. Error data: " + subject + "; " + tutor);
        }
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this(MarkType.valueOf(markType), subject, tutor);
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", markType.getMarkText(), markType.getMarkNumeric());
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    private boolean isEmpty(Subject subject, Tutor tutor) {
        return subject.toString().isBlank() & tutor.toString().isBlank();
    }

}
