package com.gmail.runkevich8.SchoolLibrary.entity;

import java.util.*;

public class Pupils {

    private String name;
    private Date bd;
    int curLiterature;

    public Pupils(String name, Date bd, int curLiterature) {
        this.name = name;
        this.bd = bd;
        this.curLiterature = curLiterature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    public int getCurLiterature() {
        return curLiterature;
    }

    public void setCurLiterature(int curLiterature) {
        this.curLiterature = curLiterature;
    }
    public  int getAge(Date birthDate)
    {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= birth.get(Calendar.DAY_OF_YEAR))
        {
            age--;
        }

        return age;
    }
}
