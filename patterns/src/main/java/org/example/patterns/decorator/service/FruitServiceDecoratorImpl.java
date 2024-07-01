package org.example.patterns.decorator.service;

import lombok.RequiredArgsConstructor;
import org.example.patterns.decorator.domain.FruitD;
import org.example.patterns.decorator.service.old.FruitServiceD;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitServiceDecoratorImpl implements FruitServiceDecorator {

    private final FruitServiceD fruitService;

    //расширение функционала
    @Override
    public void cutFruit(FruitD fruitD) {
        System.out.println("FruitServiceDecoratorImpl.cutFruit");
    }

    @Override
    public FruitD add(FruitD fruitD) {
        return fruitService.add(fruitD);
    }

    @Override
    public FruitD remove(FruitD fruitD) {
        return fruitService.remove(fruitD);
    }

    @Override
    public FruitD update(FruitD fruitD) {
        return fruitService.update(fruitD);
    }
}
