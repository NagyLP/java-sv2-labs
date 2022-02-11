package activity;

import java.util.*;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

//    public void addActivity(Activity activity) {
//        activities.add(activity);
//            }

    public List<Report> distancesByTypes() {
        Map<ActivityType, Report> typeReports = new LinkedHashMap<>();
        Arrays.stream(ActivityType.values())
                .forEach(activityType -> typeReports.put(activityType, new Report(activityType, 0.0)));

        for (Activity item : activities) {
            Report reports = typeReports.get(item.getType());
            typeReports.put(item.getType(), new Report(item.getType(), reports.getDistance() + item.getDistance()));
        }
        return new ArrayList<>(typeReports.values());

//        List<Report> reports = new ArrayList<>();
//        for (ActivityType activityType : ActivityType.values()) {
//            int distance = 0;
//            for (Activity item : activities) {
//                if (item.getType() == activityType) {
//                    distance += item.getDistance();
//                }
//            }
//            reports.add(new Report(activityType, distance));
//        }
//        return reports;
    }


    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(ActivityWithTrack.class::isInstance)
//            .filter(actvty -> actvty instanceof ActivityWithTrack)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(ActivityWithoutTrack.class::isInstance)
                .count();
    }
}
