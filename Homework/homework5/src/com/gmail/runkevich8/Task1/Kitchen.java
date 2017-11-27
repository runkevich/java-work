package com.gmail.runkevich8.Task1;

public class Kitchen extends Technique {

    String mission;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public Kitchen(int cost, int size, String model, int color, String mission) {
        super(cost, size, model, color);
        this.mission = mission;
    }

}
