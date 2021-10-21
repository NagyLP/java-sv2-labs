package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconods;

    public Time (int hours, int minutes, int seconods) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconods = seconods;
    }

    public int getInMinutes() {return (hours*60) +minutes;}
    public int getInSeconds() {return (getInMinutes()*60) +seconods;}

    public boolean earlierThan(Time compare) {
        int time1 = this.getInSeconds();
        int time2 = compare.getInSeconds();
        return time1 < time2;
    }

    public String toString() {return hours+":"+minutes+":"+seconods;}

    public void setHour(int hour) {this.hours = hour;}
    public void setMinutes(int minutes) {this.minutes = minutes;}
    public void setSeconods(int seconods) {this.seconods = seconods;}
}
