package stringbasic;

public class Student {

    private Person person;
    private String neptunCode;
    private String educationID;
    private String entrCardNum;

    public Student(Person person, String neptunCode, String educationID) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationID = educationID;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }
    public void setEducationID(String educationID) {
        this.educationID = educationID;
    }
    public void setEntrCardNum(String entrCardNum) {
        this.entrCardNum = entrCardNum;
    }

    public Person getPerson() {
        return person;
    }
    public String getNeptunCode() {
        return neptunCode;
    }
    public String getEducationID() {
        return educationID;
    }
    public String getEntrCardNum() {
        return entrCardNum;
    }
}
