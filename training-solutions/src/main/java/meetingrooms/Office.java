package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    // TALÁN LEHETNE interfész az "Iroda"//
    //
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
        for (int i = 1; i <= meetingRooms.size() - 1; i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (MeetingRoom item : meetingRooms) {
            System.out.println(item.getArea());
        }
    }

    public void printMeetingRoomsWithName(String name) {
        errorEmptyList();
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().equals(name)) {
                System.out.println(printDataOfMeetingRooms(item));
            }
            System.out.println("Nem találtam a megadott \"" + name + "\" megnevezésű trágyalónevet.");
        }
    }

    public void printMeetingRoomsContains(String part) {
        errorEmptyList();
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println(printDataOfMeetingRooms(item));
            }
            System.out.println("Nem találtam a megadott \"" + part + "\" névtöredéket tartalmazó tárgyalónevet.");
        }
    }

    public void printAreasLargerThan(int area) {
        errorEmptyList();
        for (MeetingRoom item : meetingRooms) {
            if (item.getArea() > area) {
                System.out.println(printDataOfMeetingRooms(item));
            }
            System.out.println("Nincs a megadott \"" + area + "\" méretűnél nagyobb területű tárgyaló.");
        }
    }

    public String printDataOfMeetingRooms(MeetingRoom meetingRoom) {
        return String.format("Tárgyaló:%n -neve: %s%n -hossza: %d%n -szélessége: %d%n -területe: %d",
                meetingRoom.getName(), meetingRoom.getLength(), meetingRoom.getWidth(), meetingRoom.getArea());
    }

    public void errorEmptyList() {
        if (meetingRooms.isEmpty()) System.out.println("Üres a lista.");
    }
}
