package controlselection.month;

public class DayInMonth {

    public static int getNumberOfDayinMonth (int year, String month) {
        switch (month.trim().toLowerCase()) {

            case "január", "március", "május", "július", "augusztus", "október", "december":
            return 31;

            case "április", "jűnius", "szeptember", "november":
            return 30;

            case "február":
            if (year % 4 == 0 & (year % 100 != 0 || year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }

            default: return 0;
        }
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(getNumberOfDayinMonth(2020, "február"));
    }
}
