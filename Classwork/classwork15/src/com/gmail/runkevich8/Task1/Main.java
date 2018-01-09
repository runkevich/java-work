package com.gmail.runkevich8.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start main");

        Thread1 thread1 = new Thread1();

        //........1 способ............
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //все ,что тут будет написано, будет запущено в другом потоке
//
//                for (int i = 0; i< 10; i++){
//                    System.out.println("thread1 i = " + i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
        //thread1.run(); - ошибка - запускается все в ЭТОМ ЖЕ поток


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //все ,что тут будет написано, будет запущено в другом потоке

                for (int i = 0; i< 10; i++){
                    System.out.println("thread2 i = " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        //thread2.start();

        //thread2.stop();//останавливает поток - не рекомендуется использоват

        try {
            //thread1.join();//ждем пока выполнится поток
           // thread2.join();
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //thread1.setFinish(true);
        thread1.interrupt();

        System.out.println("End main");
    }

    public static void test(){

    }

}
