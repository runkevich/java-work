package com.gmail.runkevich8.Task2;


import java.util.ArrayList;
import java.util.List;

public class Build {
    private final String name;
    private List<Room> roomList = new ArrayList<>();


    public Build(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room){
        roomList.add(room);
    }
    

    public void addRoom(String nameRoom, double sq, int windows) {
        roomList.add(new Room(nameRoom,sq,windows));
    }

    public List<Room> getRoomList() {
        return roomList;
    }



}
