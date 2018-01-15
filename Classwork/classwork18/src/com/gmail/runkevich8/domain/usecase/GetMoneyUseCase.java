package com.gmail.runkevich8.domain.usecase;

import com.gmail.runkevich8.domain.entity.GetMoneyResult;
import com.gmail.runkevich8.domain.entity.Money;
import com.gmail.runkevich8.domain.repository.MoneyRepository;

public class GetMoneyUseCase implements UseCase{

    private MoneyRepository moneyRepository;


    public GetMoneyUseCase(MoneyRepository moneyRepository){
        this.moneyRepository = moneyRepository;
    }

    public void execute(Money money, GetMoneyResultListener resultListener){

        //только один метод в usecase!!!!
        //получаем текущее количество денег


        Money currentMoney = moneyRepository.get();
        //int currentMoney = moneyRepository.get().getMoney()

        //проверяем достаточно ли денег
        if (currentMoney.getMoney() >= money.getMoney()){

            Money newMoney = new Money();
            newMoney.setMoney(currentMoney.getMoney() - money.getMoney());

            //сохраняем новое количество денег
            moneyRepository.save(newMoney);

            //возвращаем результат в PRESENTATION слой
            GetMoneyResult result = new GetMoneyResult();
            resultListener.onResult(result);


        }else {
            //возвращаем результат в PRESENTATION слой
            resultListener.onError();
        }

    }

    public interface GetMoneyResultListener{
       void onResult(GetMoneyResult getMoneyResult);
        void onError();
    }

}
