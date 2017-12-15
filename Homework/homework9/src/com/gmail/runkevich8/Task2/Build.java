package com.gmail.runkevich8.Task2;


import jdk.internal.joptsimple.internal.Rows;

import java.util.ArrayList;
import java.util.List;

public class Build {
    private final String name;
    private List<Room> roomList = new ArrayList<>();
  //  private String nameRoom;
   // private int numberWindows = 0;
  //  private double sq;

    public Build(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room){
        roomList.add(room);
    }
    

    public void addRoom(String nameRoom, double s, int windows) {
        roomList.add(new Room(nameRoom, s, windows));
    }

    public List<Room> getRoomList(String nameRoom) {
        return roomList;
    }
}
