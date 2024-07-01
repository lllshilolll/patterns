package org.example.patterns.decorator.service;

import lombok.RequiredArgsConstructor;
import org.example.patterns.decorator.domain.Fruit;
import org.example.patterns.decorator.service.old.FruitService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitServiceDecoratorImpl implements FruitServiceDecorator {

    private final FruitService fruitService;

    //расширение функционала
    @Override
    public void cutFruit(Fruit fruit) {
        System.out.println("FruitServiceDecoratorImpl.cutFruit");
    }

    @Override
    public Fruit add(Fruit fruit) {
        return fruitService.add(fruit);
    }

    @Override
    public Fruit remove(Fruit fruit) {
        return fruitService.remove(fruit);
    }

    @Override
    public Fruit update(Fruit fruit) {
        return fruitService.update(fruit);
    }
}
