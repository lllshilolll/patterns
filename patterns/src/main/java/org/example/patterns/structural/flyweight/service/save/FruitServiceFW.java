package org.example.patterns.structural.flyweight.service.save;

import org.example.patterns.structural.flyweight.domain.FruitFW;

public interface FruitServiceFW {

    FruitFW add(FruitFW fruitFW);

    FruitFW update(FruitFW fruitFW);

    void delete(FruitFW fruitFW);
}
