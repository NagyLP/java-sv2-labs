package looptypesmodify;

public class Student {

    private String name;
    private boolean active;

    public Student (String name) {
        this.name = name;
        this.active = true;
    }

    public String toString() {
        return "Név: " +name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
            return name;
    }
    public boolean isActive() {
        return active;
    }
}
