package com.gmail.runkevich8.presentation;


import com.gmail.runkevich8.domain.entity.GetMoneyResult;
import com.gmail.runkevich8.domain.entity.Money;
import com.gmail.runkevich8.domain.usecase.GetMoneyUseCase;

public class Controller {

    private View view;


    public  Controller(View view){
        this.view = view;
    }

    public void getMoney(){
        //создание потом будем не тут делат
        GetMoneyUseCase getMoneyUseCase = new GetMoneyUseCase();

        Money money = new Money();
        money.setMoney(100);
        getMoneyUseCase.execute(money, new GetMoneyUseCase.GetMoneyResultListener() {
            @Override
            public void onResult(GetMoneyResult getMoneyResult) {
                view.showGetMoneyResult(true);
            }

            @Override
            public void onError() {
                view.showMessage("Деньги не снялись ");
            }
        });

        //тут стучимся в UseCase, а затем показываем данные на экране


        //view.showGetMoneyResult();
    }


}
