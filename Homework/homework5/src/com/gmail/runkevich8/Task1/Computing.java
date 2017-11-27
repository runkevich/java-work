package com.gmail.runkevich8.Task1;

public class Computing extends Technique {

    String OS;

    public Computing(int cost, int size, String model, int color, String OS) {
        super(cost, size, model, color);
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

}
