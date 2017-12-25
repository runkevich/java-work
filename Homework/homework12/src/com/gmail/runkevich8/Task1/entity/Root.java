package com.gmail.runkevich8.Task1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;
import java.util.List;

public class Root {

    private String name;

    @JsonDeserialize(as = Gender.class)
    private Gender gender;

    private Date date;
    private List<People> people;

    public Root() {

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Root root = (Root) o;

        if (name != null ? !name.equals(root.name) : root.name != null) return false;
        return people != null ? people.equals(root.people) : root.people == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (people != null ? people.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Root" +
                "name = " + name +
                ", people=" + people + " \ndate - " + date + " \ngender - " + gender;
    }
}
