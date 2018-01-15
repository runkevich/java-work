package com.gmail.runkevich8.Task1;

import java.util.ArrayList;

public class Controller { // sort

    private ArrayList<Model> data;

    private View view;


    public  Controller(View view){
        this.view = view;
    }

    public String getDtaSortByName(){

        //return database.getModel;
        return data.get(5).getName();
    }

    public String getHello() {
        return "Hello";
    }

    public int getNumber(){
        view.showMessage("ERRRRROOOOOR");
        return 5;
    }

}
