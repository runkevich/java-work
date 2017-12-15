package com.gmail.runkevich8.Task2;

public class Person {

    private String name;
    private String surname;
    private String lastLastName;

    public Person(String name, String surname, String lastLastName) {
        this.name = name;
        this.surname = surname;
        this.lastLastName = lastLastName;
    }

    @Override
    public String toString() {
        return  name +" " + surname + " " + lastLastName ;
    }
}
