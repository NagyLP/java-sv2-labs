package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private final List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom item : meetingRooms) {
            System.out.println(item.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 1; i <= meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (MeetingRoom item : meetingRooms) {
            System.out.println(item.getArea());
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().equals(name)) {
                System.out.println(printDataOfMeetingRooms(item));
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().contains(part)) {
                System.out.println(printDataOfMeetingRooms(item));
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom item : meetingRooms) {
            if (item.getArea() > area) {
                System.out.println(printDataOfMeetingRooms(item));
            }
        }
    }

    public String printDataOfMeetingRooms(MeetingRoom meetingRoom) {
        return String.format("Tárgyaló neve: %s\n -hossza: %d\n -szélessége: %d\n -területe: %d",
                meetingRoom.getName(), meetingRoom.getLength(), meetingRoom.getWidth(), meetingRoom.getArea());
    }
}
