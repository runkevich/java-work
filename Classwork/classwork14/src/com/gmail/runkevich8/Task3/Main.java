package com.gmail.runkevich8.Task3;

public class Main {


        //..........static - important...............
//    private static AbstractClass a = new AbstractClass() {
//        @Override
//        public void test() {
//
//        }
//    };

    public static void main(String[] args) {
    //    makeSmth(a);

        makeSmth(new AbstractClass() {
            @Override
            public void test() {

            }
        });

        makeSmth(new AbstractClass() {
            @Override
            public void test() {

            }

        });
        //.....in Java 8 .............
//        makeSmth(()-> {
//        });
    }

    public static void makeSmth(AbstractClass obj){
        obj.test();
    }
}
