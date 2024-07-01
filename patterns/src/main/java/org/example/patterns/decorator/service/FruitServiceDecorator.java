package org.example.patterns.decorator.service;

import org.example.patterns.decorator.domain.Fruit;
import org.example.patterns.decorator.service.old.FruitService;

public interface FruitServiceDecorator extends FruitService {

    default void cutFruit(Fruit fruit) {
        System.out.println("Cut " + fruit);
    }

    @Override
    default Fruit add(Fruit fruit) {
        return null;
    }

    @Override
    default Fruit remove(Fruit fruit) {
        return null;
    }

    @Override
    default Fruit update(Fruit fruit) {
        return null;
    }
}
