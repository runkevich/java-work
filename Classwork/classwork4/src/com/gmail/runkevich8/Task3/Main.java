package com.gmail.runkevich8.Task3;

public class Main {

    public static void main(String[] arg) {

        Pacient pacient = new Pacient();
        pacient.setName("Al");
        pacient.setAge(9);

        System.out.println(pacient.getName() + " " + pacient.getAge());
    }
}
