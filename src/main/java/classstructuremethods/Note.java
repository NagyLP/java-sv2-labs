package classstructuremethods;

public class Note {

    private String name;
    private String topic;
    private String text;

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNoteText() {
        return name+ " : " + "(" +topic+ ")    " +text;
    }
}
