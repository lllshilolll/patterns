package org.example.patterns.generative.abstract_factory.service;

import lombok.AllArgsConstructor;
import org.example.patterns.generative.abstract_factory.domain.AppleAF;
import org.example.patterns.generative.abstract_factory.domain.OrangeAF;
import org.example.patterns.generative.abstract_factory.service.save.AppleFactory;
import org.example.patterns.generative.abstract_factory.service.save.OrangeFactory;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FruitFactoryImpl implements FruitFactory {

    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;

    @Override
    public AppleAF createApple() {
        return appleFactory.create();
    }

    @Override
    public OrangeAF createOrange() {
        return orangeFactory.create();
    }
}
