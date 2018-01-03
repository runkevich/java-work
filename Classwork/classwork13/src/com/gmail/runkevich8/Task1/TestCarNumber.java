package com.gmail.runkevich8.Task1;


import org.junit.*;
import org.junit.rules.ExpectedException;

public class TestCarNumber extends Assert {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    Main main;
    @Before
    public void before(){ // конструктор для теста
        main = new Main();

    }
    @After
    public void after(){

        main = null;
    }

    @Test
    public void testCarNumber1(){
        boolean result = Main.checkCarNubber("2020 MP-7");
        assertTrue(result);
    }

    @Test
    public void testCarNumber2(){
        boolean result = Main.checkCarNubber("1029 MP-3");
        assertTrue(result);
    }

    @Test
    public void testCarNumber3(){
        boolean result = Main.checkCarNubber("9012 AC-1");
        assertTrue(result);
    }

    @Test
    public void testCarNumber4(){
        boolean result = Main.checkCarNubber("9013 AC-1");
        assertTrue(result);
    }

    @Test
    public void testCarNumber5(){
        expectedException.expect(NullPointerException.class);
        Main.checkCarNubber(null);
    }
}
