package org.example.patterns.structural.decorator.service.old;

import org.example.patterns.structural.decorator.domain.FruitD;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceDImpl implements FruitServiceD {
    @Override
    public FruitD add(FruitD fruitD) {
        return new FruitD();
    }

    @Override
    public FruitD remove(FruitD fruitD) {
        return null;
    }

    @Override
    public FruitD update(FruitD fruitD) {
        return new FruitD();
    }
}
