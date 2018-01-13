package com.gmail.runkevich8.Task1;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.loadData(args[0]);

        System.out.println(manager.DescriptionMusic());
        System.out.println(manager.DuplicateCheckSum());
        System.out.println(manager.Duplicates());
    }
}
