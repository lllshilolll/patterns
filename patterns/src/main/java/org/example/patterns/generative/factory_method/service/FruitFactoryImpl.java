package org.example.patterns.generative.factory_method.service;

import lombok.RequiredArgsConstructor;
import org.example.patterns.generative.factory_method.domain.FruitFM;
import org.example.patterns.generative.factory_method.domain.FruitTypeFM;
import org.example.patterns.generative.factory_method.service.save.AppleFactory;
import org.example.patterns.generative.factory_method.service.save.OrangeFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitFactoryImpl implements FruitFactory {
    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;

    @Override
    public FruitFM create(FruitTypeFM type) {
        return switch (type) {
            case APPLE -> appleFactory.create();
            case ORANGE -> orangeFactory.create();
        };
    }
}
