package com.gmail.runkevich8.Task1;

public class Main {

    public static void main(String[] arg){

        People[] peopleArray = new  People[2];

        People people1 = new People("Vasya", 25);
        //people1.setName("Vasya");
       // people1.setAge(25);
        people1.staticValue = 100; //People.staticValue = 100; - правильное написание , через класс

        People people2 = new People();
        people2.setName("Ivan");
        people2.setAge(27);
        people2.staticValue = 200;

        peopleArray[0] = people1;
        peopleArray[1] = people2;

        for (People people: peopleArray){
            printPeople(people);
        }

        //   //printPeople(people1);
      // // printPeople(people2);

    }

    public static void printPeople(People people){
        System.out.println("name = " + people.getName());
        System.out.println("age = " + people.getAge());
        System.out.println("staticValue  = " + people.staticValue );

    }


}
