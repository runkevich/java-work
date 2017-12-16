package com.gmail.runkevich8.Task1.entity;

public class People {

    private int id;
    private int age;
    private boolean isDegree;
    private String name;
    private String surname;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (id != people.id) return false;
        if (age != people.age) return false;
        if (isDegree != people.isDegree) return false;
        if (name != null ? !name.equals(people.name) : people.name != null) return false;
        return surname != null ? surname.equals(people.surname) : people.surname == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        result = 31 * result + (isDegree ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", age=" + age +
                ", isDegree=" + isDegree +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
