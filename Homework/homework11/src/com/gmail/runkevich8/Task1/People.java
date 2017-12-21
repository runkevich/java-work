package com.gmail.runkevich8.Task1;

public class People {
    private String id;
    private String age;
    private String isDegree;
    private String name1;
    private String surname;


    public String getName1() {
        return name1;
    }

    public void setName1(String name) {
        this.name1 = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDegree(String degree) {
        isDegree = degree;
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
        if (isDegree != people.isDegree) return false;if (name1 != null ? !name1.equals(people.name1) : people.name1 != null) return false;
        return surname != null ? surname.equals(people.surname) : people.surname == null;
    }



    @Override
    public String toString() {
        return "People:  " +
                "id=" + id +
                ", age=" + age +
                ", isDegree=" + isDegree +
                ", name=" + name1  +
                ", surname=" + surname;
    }
}
