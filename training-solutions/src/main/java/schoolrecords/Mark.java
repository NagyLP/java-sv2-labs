package schoolrecords;

public class Mark {

    private final MarkType markType;
    private final Subject subject;
    private final Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this(MarkType.valueOf(markType), subject, tutor);
    }

    @Override
    public String toString() {
        return String.format("Mark:\n Mark type: %s(%d, %s)\n subject: %s\n tutor: %s",
                markType, markType.getMarkNumeric(), markType.getMarkText(),
                subject.getSubjectName(),
                tutor.getName());
    }

    private boolean isEmpty(String str) {
        return str.isBlank();
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
}
