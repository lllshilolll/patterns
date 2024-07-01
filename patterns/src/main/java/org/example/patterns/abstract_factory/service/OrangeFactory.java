package org.example.patterns.abstract_factory.service;

import org.example.patterns.abstract_factory.domain.Orange;
import org.springframework.stereotype.Component;

@Component
public class OrangeFactory implements ConcreteAbstractFactory<Orange>{
    @Override
    public Orange create() {
        return new Orange();
    }
}
