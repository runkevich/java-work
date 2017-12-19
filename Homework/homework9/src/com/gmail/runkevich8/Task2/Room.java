package com.gmail.runkevich8.Task2;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private static final int maxPercent = 70;

    //площаадь комнаты
    private double sq;
    private double freeSq;
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

    public double getFreeSq() {
        return freeSq;
    }

    public void setFreeSq(double freeSq) {
        this.freeSq = freeSq;
    }

    private void addLamp(Lamp lamp) throws Exception{
        if (){
            throw new Exception();//Exception2();
            return;
        }
        lampList.add(lamp);
    }

    private void addFurniture(Furniture furniture) throws Exception{
        if () {
            throw new Exception();//Exception1();
            return;
        }

        furnitureList.add(furniture);

    }
//    public void addLamp(int light) {
//
//        lampList.add(new Lamp(light));
//    }
//
//    public void addFurniture(Furniture furniture) {
//
//        furnitureList.add(furniture);
//    }
    public List<Furniture> getFurnitures() {
        return furnitureList;
    }

}
