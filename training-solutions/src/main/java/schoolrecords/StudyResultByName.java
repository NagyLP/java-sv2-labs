package schoolrecords;

public class StudyResultByName {

    private final String studentName;
    private final double studyAverage;

    public StudyResultByName(String studentName, double studyAverage) {
        if (studentName == null) {
            throw new NullPointerException
                    ("Name & Subject must not be null. Error data: " + studentName);
        }
        if (isEmpty(studentName)) {
            throw new IllegalArgumentException
                    ("Name & Subject must not be empty. Error data: " + studentName);
        }
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    @Override
    public String toString() {
        return String.format("Study result by name:\n Student name: %s\n Total avarage: %d\n",
                studentName, studyAverage);
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    private boolean isEmpty(String studentName) {
        return studentName.isBlank();
    }
}
