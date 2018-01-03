package com.gmail.runkevich8.Task1;

import org.junit.Assert;
import org.junit.Test;

public class TestPhoneNumber extends Assert{

    @Test
    public void testPhone1(){
        boolean result = Main.checkPhoneNubber("375292328171");
        assertTrue(result);
    }

    @Test
    public void testPhone2(){
        boolean result = Main.checkPhoneNubber("+375 (29) 232-71-81");
        assertTrue(result);
    }

}
