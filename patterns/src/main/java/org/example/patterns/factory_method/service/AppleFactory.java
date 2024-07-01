package org.example.patterns.factory_method.service;

import org.example.patterns.factory_method.domain.Apple;
import org.springframework.stereotype.Component;

@Component
public class AppleFactory implements ConcreteFruitFactory<Apple> {

    @Override
    public Apple create() {
        return new Apple();
    }
}
