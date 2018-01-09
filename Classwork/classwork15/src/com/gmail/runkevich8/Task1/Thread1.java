package com.gmail.runkevich8.Task1;

public class Thread1 extends Thread{
    //...............2 способ.......................
    public boolean isFinish = false;

    public void setFinish(boolean finish){
        isFinish = finish;
    }

    @Override
    public void run(){

        for (int i = 0; i< 10; i++){

           // if (isFinish) return;
            if (isInterrupted()){
                System.out.println("stop by if");
                return;
            }

            System.out.println("thread1 i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {//в том случае, когда нужно остановить поток , а мы еще спим
                System.out.println("stop by InterruptedException");
                return;
            }
        }

    }
}
