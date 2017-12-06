package com.gmail.runkevich8.Task1;

import java.util.Date;

public class Student {

    private String name;
    private String surname;

    public Student(String name, String surname, Date bd) {
        this.name = name;
        this.surname = surname;
        this.bd = bd;
    }

    private Date bd;

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    @Override
//    public String toString() {
//        StringBuilder builder= new StringBuilder();
//        builder.append("First Name ");
//        builder.append(name);
//        builder.append(" Last Name");
//        builder.append(", Date of birthday: ");
//        builder.append(bd);
//
//        return builder.toString();
//    }




}
