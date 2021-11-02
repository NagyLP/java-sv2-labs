package Day01;

public class Actor {

    private String actorName;
    private int yearOfBirth;

    public Actor(String authorName, int yearOfBirth) {
        this.actorName = authorName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getAuthorName() {return actorName;}
    public int getYearOfBirth() {return yearOfBirth;}
}
