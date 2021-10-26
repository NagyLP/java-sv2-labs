package introconstructors;

public class TaskMain {
    public static void main(String[] args) {

        Task task = new Task("Feladat", "Feladatok feladata");

        System.out.println("Cím: " + task.getTitle());
        System.out.println("Leírás: " + task.getDescription());

        task.start();
        task.setDuration(10000);

        System.out.println("Apa kezdődik' "
                + task.getStartDateTime()
                + " csilliomod másodperckor és tartott "
                + task.getDuration()
                + " percig.");

    }
}
