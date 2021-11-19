package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {

    List<Hour> hoursOfDay = new ArrayList<>();

public void setDayPeriod() {
    for (Hour item : hoursOfDay) {
        if (item.hourNumber >= 6.0 && item.hourNumber < 22.0) {
            item.setPeriod(DayPeriod.DAYTIME);
        }
        item.setPeriod(DayPeriod.NIGHTTIME);
    }
}

    public void addHour (Hour hour) {
        hoursOfDay.add(hour);
    }

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }
}
