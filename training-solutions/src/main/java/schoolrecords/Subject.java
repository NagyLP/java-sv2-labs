package schoolrecords;

public class Subject {

    private final String subjectName;

    public Subject(String subjectName) {
        if (subjectName == null) {
            throw new NullPointerException("Subject must not be null. Error data: " + subjectName);
        }
        if (isEmpty(subjectName)) {
            throw new IllegalArgumentException("Subject must not be empty. Error data: " + subjectName);
        }
        this.subjectName = subjectName;
    }

    private boolean isEmpty(String str) {
        return str.isBlank();
    }

    public String getSubjectName() {
        return subjectName;
    }
}

