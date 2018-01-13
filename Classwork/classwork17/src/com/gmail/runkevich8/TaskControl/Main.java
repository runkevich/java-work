package com.gmail.runkevich8.TaskControl;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Manager manager = new Manager();
       /// for (int i = 0 ; i< args.length; i++){
            manager.loadData(args[0]);
           // manager.parseDom(args[i]);
       // }

    }
}
