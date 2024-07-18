package org.example.patterns.behavioral.observer.service.custom.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.observer.domain.FruitO;
import org.example.patterns.behavioral.observer.service.custom.MyFruitOService;
import org.example.patterns.behavioral.observer.service.custom.Observable;
import org.example.patterns.behavioral.observer.service.custom.Observer;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MyFruitOServiceImpl implements MyFruitOService, Observable {

    private final List<Observer<FruitO>> observers;

    @Override
    public void add(FruitO fruit) {
        log.info("Add fruit {}", fruit);

        notifyObservers(fruit);
    }

    @NonNull
    @Override
    public List<Observer<FruitO>> getObservers() {
        return observers;
    }
}
