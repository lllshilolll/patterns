package org.example.patterns.factory_method.service;


import org.example.patterns.factory_method.domain.Orange;
import org.springframework.stereotype.Component;

@Component
public class OrangeFactory implements ConcreteFruitFactory<Orange> {

    @Override
    public Orange create() {
        return new Orange();
    }
}
