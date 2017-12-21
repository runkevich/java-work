package com.gmail.runkevich8.Task2;

import java.util.ArrayList;
import java.util.List;

public class Room {

    //площаадь комнаты
    private double sq;
    private String nameRoom;

    private int numberWindows = 0;

    private List<Lamp> lampList = new ArrayList<>();
    private List<Furniture>  furnitureList = new ArrayList<>();


    public Room(String nameRoom, double sq, int numberWindows) {
        this.sq = sq;
        this.nameRoom = nameRoom;
        this.numberWindows = numberWindows;
    }

    public List<Lamp> getLampList() {
        return lampList;
    }

    public void setLampList(List<Lamp> lampList) {
        this.lampList = lampList;
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void setFurnitureList(List<Furniture> furnitureList) {
        this.furnitureList = furnitureList;
    }

    public int getNumberWindows() {
        return numberWindows;
    }

    public void setNumberWindows(int numberWindows) {
        this.numberWindows = numberWindows;
    }

    public double getSq() {
        return sq;
    }

    public void setSq(double sq) {
        this.sq = sq;
    }


    private void addLp(Lamp lamp) throws Exception{
        lampList.add(lamp);
    }

    public void addFurniture(Furniture furniture) throws Exception{

        furnitureList.add(furniture);

    }

    public List<Furniture> getFurnitures() {
        return furnitureList;
    }

    public void addLamp(int i) {
        lampList.add(new Lamp(i));
    }
}
