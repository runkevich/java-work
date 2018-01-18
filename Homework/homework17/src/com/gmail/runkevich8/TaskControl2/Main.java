package com.gmail.runkevich8.TaskControl2;

import javax.xml.transform.TransformerException;


public class Main {

    public static void main(String[] args) throws TransformerException {

        Manager manager = new Manager();
        manager.writeFile(Manager.loadData(args));

    }

}
