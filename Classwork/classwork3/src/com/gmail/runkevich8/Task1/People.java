package com.gmail.runkevich8.Task1;

public class People {

    public static int staticValue;

    private String name;
    private int age;

    public People() { // конструктор по умолчанию
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //    public static void test(){
//        name                      БУДЕТ ОШИБКА - ОТСУТСТВУЕТ ДОСТУП К ПЕРЕМЕННЫМ
//    }

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
}
