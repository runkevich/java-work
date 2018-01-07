package com.gmail.runkevich8.Task3.test;

import com.gmail.runkevich8.Task3.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestAdd extends Assert {


        @Test
    public void testAdd1(){
            Main.testAdd(360);
        }

    @Test
    public void testAdd2(){
        Main.testAdd(400);
    }
}
