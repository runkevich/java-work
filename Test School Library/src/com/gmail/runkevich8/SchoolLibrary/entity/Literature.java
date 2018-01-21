package com.gmail.runkevich8.SchoolLibrary.entity;

import java.util.ArrayList;
import java.util.List;

public class Literature {

    List<Literature> literatureList = new ArrayList<>();

    private String name;

    public Literature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
