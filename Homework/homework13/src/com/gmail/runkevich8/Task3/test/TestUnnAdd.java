package com.gmail.runkevich8.Task3.test;

import com.gmail.runkevich8.Task3.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestUnnAdd extends Assert {


    @Test
    public void testUnnAdd1(){
        Main.testUnnAdd(360);
    }

    @Test
    public void testUnnAdd2(){
        Main.testUnnAdd(400);
    }
}
