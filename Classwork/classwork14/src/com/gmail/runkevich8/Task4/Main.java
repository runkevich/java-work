package com.gmail.runkevich8.Task4;

public class Main {

    public static void main(String[] args) {
//        int money = getMoney();
        getMoney(new OnGetMoneyListener() {
            @Override
            public void onMoney(int money) {
                //Вызовется как только нам отдадут деньги
                System.out.println(money);
            }
        });
//показать прогресс бар...
    }
//
//    public  static void getMoney(){
//        return 50;
//    }

public  static void getMoney(OnGetMoneyListener listener) {
//spend time
listener.onMoney(50);
}

}
