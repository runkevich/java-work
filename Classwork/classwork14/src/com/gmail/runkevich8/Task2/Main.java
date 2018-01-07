package com.gmail.runkevich8.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {

        Test test = new Test();

        Class classTest = test.getClass();

        System.out.println(classTest.getSimpleName());

        int mod = classTest.getModifiers();

        if(Modifier.isAbstract(mod)){ // методы для классоы
            System.out.println("Abstract");
        } else {
            System.out.println("Not abstract");
        }

        if(Modifier.isPublic(mod)){
            System.out.println("Public");
        } else {
            System.out.println("Not Public");
        }

        Field[] fields = classTest.getDeclaredFields();
        System.out.println("fields = " + fields.toString());
        for(Field a: fields){
            System.out.println("field name = " + a.getName());
            try {
                a.setAccessible(true);
                System.out.println("field value = " + (int) a.get(test));
                a.set(test,50);
                System.out.println("field value = " + (int) a.get(test));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        Method[] methods = classTest.getDeclaredMethods();
        for(Method method: methods){
            System.out.println("method name = " + method.getName());
        }
    }
}
