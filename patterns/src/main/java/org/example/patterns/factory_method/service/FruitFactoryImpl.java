package org.example.patterns.factory_method.service;

import lombok.RequiredArgsConstructor;
import org.example.patterns.factory_method.domain.Fruit;
import org.example.patterns.factory_method.domain.FruitType;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitFactoryImpl implements FruitFactory {
    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;

    @Override
    public Fruit create(FruitType type) {
        return switch (type) {
            case APPLE -> appleFactory.create();
            case ORANGE -> orangeFactory.create();
        };
    }
}
