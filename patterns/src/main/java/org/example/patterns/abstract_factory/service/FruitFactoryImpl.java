package org.example.patterns.abstract_factory.service;

import lombok.AllArgsConstructor;
import org.example.patterns.abstract_factory.domain.Apple;
import org.example.patterns.abstract_factory.domain.Orange;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FruitFactoryImpl implements FruitFactory {

    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;

    @Override
    public Apple createApple() {
        return appleFactory.create();
    }

    @Override
    public Orange createOrange() {
        return orangeFactory.create();
    }
}
