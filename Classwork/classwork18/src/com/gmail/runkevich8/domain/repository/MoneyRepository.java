package com.gmail.runkevich8.domain.repository;

import com.gmail.runkevich8.domain.entity.Money;

public interface MoneyRepository {

    Money get();
    void save(Money money);
}
