package controliteration.day;

public class Hour {

    int hourNumber;
    DayPeriod period;

    public Hour(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public void setHourNumber(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public void setPeriod(DayPeriod period) {
        this.period = period;
    }

    public int getHourNumber() {
        return hourNumber;
    }

    public DayPeriod getPeriod() {
        return period;
    }
}
