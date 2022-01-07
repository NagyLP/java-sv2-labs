package schoolrecords;

public class StudyResultByName {

    private final String studentName;
    private final double totalSubjectAvarage;

    public StudyResultByName(String studentName, double totalSubjectAvarage) {
        if (studentName == null) {
            throw new NullPointerException
                    ("Name & Subject must not be null. Error data: " + studentName);
        }
        if (isEmpty(studentName)) {
            throw new IllegalArgumentException
                    ("Name & Subject must not be empty. Error data: " + studentName);
        }
        this.studentName = studentName;
        this.totalSubjectAvarage = totalSubjectAvarage;
    }

    private boolean isEmpty(String studentName) {
        return studentName.isBlank();
    }

    @Override
    public String toString() {
        return String.format("Study result by name:\n Student name: %s\n Total avarage: %d\n",
                studentName, totalSubjectAvarage);
    }

    public String getStudentName() {
        return studentName;
    }

    public double getTotalSubjectAvarage() {
        return totalSubjectAvarage;
    }


}
