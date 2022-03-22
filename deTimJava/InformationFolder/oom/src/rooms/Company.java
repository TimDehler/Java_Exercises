package rooms;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    Scanner scanner = new Scanner(System.in);

    private final String name;
    private final String address;
    private int freeRooms;
    private final int maxRooms;

    //Array List mit For loop
    private ArrayList<Room> roomMap = new ArrayList<Room>();

    public Company(String name, String address, int maxRooms) {
        this.name = name;
        this.address = address;
        this.maxRooms = maxRooms;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getFreeRooms() {
        return freeRooms;
    }

    public int getMaxRooms() {
        return maxRooms;
    }

    public void createRoom() {
        if (roomMap.size() < maxRooms) {
            System.out.println("Put in the size of the new Room: ");
            Room room = new Room(true, scanner.nextInt());
            roomMap.add(room);
            freeRooms += 1;
        } else {
            System.out.println("You have to many rooms!");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", freeRooms=" + freeRooms +
                ", maxRooms=" + maxRooms +
                '}';
    }

    public void roomSearch() {
        System.out.println("Put in the size of the room you want to search for: ");
        int searchSize = scanner.nextInt();
        if (roomMap.size() != 0) {
            for (int i = 0; i < roomMap.size(); i++) {
                if (roomMap.get(i).getSpace() == searchSize && roomMap.get(i).isFree()) {
                    roomMap.get(i).setFree(false);
                    freeRooms -= 1;
                    System.out.println(roomMap.get(i).toString());
                }
            }
        }
    }
}
