package org.example.patterns.decorator.service;

import org.example.patterns.decorator.domain.FruitD;
import org.example.patterns.decorator.service.old.FruitServiceD;

public interface FruitServiceDecorator extends FruitServiceD {

    default void cutFruit(FruitD fruitD) {
        System.out.println("Cut " + fruitD);
    }

    @Override
    default FruitD add(FruitD fruitD) {
        return null;
    }

    @Override
    default FruitD remove(FruitD fruitD) {
        return null;
    }

    @Override
    default FruitD update(FruitD fruitD) {
        return null;
    }
}
