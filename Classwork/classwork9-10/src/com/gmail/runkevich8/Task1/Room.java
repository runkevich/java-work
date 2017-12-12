package com.gmail.runkevich8.Task1;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private static final int maxPercent = 70;

    //площаадь комнаты
    private double sq;
    private double freeSq;

    private int numberWindows = 0;

    private List<Lamp> lampList = new ArrayList<>();
    private List<Furniture>  furnitureList = new ArrayList<>();

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
//        if (){
//            throw new Exception();//Exception2();
//            return;
//        }
        lampList.add(lamp);
    }

    private void addFurniture(Furniture furniture) throws Exception{
//        if () {
//            throw new Exception();//Exception1();
//            return;
//        }
//
        furnitureList.add(furniture);

    }

}
