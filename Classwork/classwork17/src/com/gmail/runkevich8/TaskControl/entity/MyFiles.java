package com.gmail.runkevich8.TaskControl.entity;

import java.util.Date;

public class MyFiles {

    public String nameF;
    public long sizeF;
    public String creationTime;
    String pathName;

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public long getSizeF() {
        return sizeF;
    }

    public void setSizeF(long sizeF) {
        this.sizeF = sizeF;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Name: " + nameF + '\'' +
                ", sizeF = " + sizeF +
                ", creationTime = '" + creationTime ;
    }
}
