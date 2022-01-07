package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String studentName;
    private final List<Mark> marks = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new IllegalArgumentException("Mark must be not null. Error data: " + mark);
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
        int markAmuntTotal = 0;
        int markPiecesSum = 0;

        for (Mark item : marks) {
            if (item.getSubject().getSubjectName().contains(subject.getSubjectName())) {
                markAmuntTotal += item.getMarkType().getMarkNumeric();
                markPiecesSum++;
            }
        }
        return markAmuntTotal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }
}