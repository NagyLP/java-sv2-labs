package schoolrecords;

import java.util.List;

public class Tutor {

    private final String name;
    private final List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (name == null || taughtSubjects == null) {
            throw new NullPointerException
                    ("Name & Subject must not be null. Error data: " + name + " " + taughtSubjects);
        }
        if (isEmpty(name, taughtSubjects)) {
            throw new IllegalArgumentException
                    ("Name & Subject must not be empty. Error data: " + name + " " + taughtSubjects);
        }
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        return taughtSubjects.contains(subject);
    }

    public String getName() {
        return name;
    }

    private boolean isEmpty(String name, List<Subject> taughtSubjects) {
        return name.isBlank() || taughtSubjects.isEmpty();
    }
}
