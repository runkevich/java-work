package com.gmail.runkevich8.Task1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class People {

    private int id;
    private int age;

    @JsonDeserialize(as = boolean.class)
    private boolean isDegree;

    @JsonProperty("name")
    private String firstName; // переименовка

    private String surname;

    public People() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDegree() {
        return isDegree;
    }

    public void setDegree(boolean degree) {
        isDegree = degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (id != people.id) return false;
        if (age != people.age) return false;
        if (isDegree != people.isDegree) return false;
        if (firstName != null ? !firstName.equals(people.firstName) : people.firstName != null) return false;
        return surname != null ? surname.equals(people.surname) : people.surname == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        result = 31 * result + (isDegree ? 1 : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nPeople : " +
                "id=" + id +
                ", age=" + age +
                ", isDegree=" + isDegree +
                ", firstName = " + firstName +
                ", surname = " + surname;
    }
}
