package org.example.patterns.abstract_factory.service;

import org.example.patterns.abstract_factory.domain.Apple;
import org.springframework.stereotype.Component;

@Component
public class AppleFactory implements ConcreteAbstractFactory<Apple> {
    @Override
    public Apple create() {
        return new Apple();
    }
}
