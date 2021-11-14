package controlselection.week;

public class DayOfWeeks {

    public String switchDay(String day) {
        switch (day.trim().toLowerCase()) {
            case "hétfő":
                return "hét eleje";
            case "kedd", "szerda", "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat", "vasárnap":
                return "hétvége!";
            default:
                return "ismeretlen nap";
        }
    }
}
