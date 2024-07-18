package org.example.patterns.behavioral.observer.service.jdk.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.observer.domain.FruitO;
import org.example.patterns.behavioral.observer.service.jdk.FruitOService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class FruitOServiceImpl extends Observable implements FruitOService {

    private final List<Observer> observers;

    @Override
    public void addFruit(FruitO fruit) {
        log.info("Add fruit {}", fruit);

        notifyObservers(fruit);
    }

    @Override
    public void notifyObservers(Object arg) {
        Optional.ofNullable(observers).orElse(List.of())
                .forEach(observer -> {
                    observer.update(this, arg);
                });
    }
}
