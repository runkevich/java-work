package com.gmail.runkevich8.Task2;

public class Main {
    public static void main(String[] args) {

       final int lamp = 70;

        Build building = new Build("Здание 1");
        building.addRoom("Комната 1", 100, 3);
        building.addRoom("Комната 2", 5, 2);
        building.getRoomList("Комната 1").add(new Lamp(270));

        building.getRoomList("Комната 1").add(new Lamp());
        building.getRoomList("Комната 1").add(new Furniture( 3);
        building.getRoomList("Комната 1").add(new 10);

        building.describe();
    }



}
