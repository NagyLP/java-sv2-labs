package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name == null) {
            throw new NullPointerException("Study name is null. Error data: " + name);
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        int markAmountTotal = 0;
        int markPiecesSum = 0;

        for (Mark item : marks) {
            markAmountTotal += item.getMarkType().getMarkNumeric();
            markPiecesSum++;
        }
        if (markAmountTotal == 0) {
            throw new ArithmeticException("Grade must be not zero. Error data: " + markPiecesSum);
        }
        return (double) markAmountTotal / markPiecesSum;
    }

    public double calculateSubjectAverage(Subject subject) {
        if (subject == null) {
            throw new NullPointerException("Subject must be not null. Error data: " + subject);
        }
        double markAmuntTotal = 0;
        int markPiecesSum = 0;
        for (Mark item : marks) {
            if (item.getSubject().getSubjectName().contains(subject.getSubjectName())) {
                markAmuntTotal += item.getMarkType().getMarkNumeric();
                markPiecesSum++;
            }
        }
        if (markPiecesSum == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return markAmuntTotal / markPiecesSum;
    }

    @Override
    public String toString() {
        return name + " marks: " + (new Student(name).marks.toString() + MarkType.values().toString());
    }

    public String getName() {
        return name;
    }

    private boolean isEmpty(String str) {
        return str.isEmpty();
    }
}
