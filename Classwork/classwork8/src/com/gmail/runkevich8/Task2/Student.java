package com.gmail.runkevich8.Task2;

public class Student implements Comparable<Student> { // если один вариант сортировки - Comparable<Student>

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override //
//    public boolean equals(Object object){
//
//            Student student = (Student) object;
//
//            return this.name.equals(student.getName());
//    }


    @Override
    public boolean equals(Object o) { // для сравнения объектов - обязательно переопределять !!!!!!!
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() { // должен быть уникальнымдля двух разных объектов (используется в  Map)
        int result = name != null ? name.hashCode() : 0; //(однако могут быть случаи ,когда будет не уникальным)
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) { // сортировка по дню рождению - есть текущий объект и левый (они сравниваются)

        if (this.age == o.age && this.name.compareTo(o.getName()) == 0)
            return 0;

        if (this.age > o.age) return 1;
        return -1;

        //return  this.name.compareTo(o.getName());
    }
    // какие методы есть в Object ??


}
