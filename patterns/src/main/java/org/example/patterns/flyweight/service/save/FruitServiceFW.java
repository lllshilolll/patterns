package org.example.patterns.flyweight.service.save;

import org.example.patterns.flyweight.domain.FruitFW;

public interface FruitServiceFW {

    FruitFW add(FruitFW fruitFW);

    FruitFW update(FruitFW fruitFW);

    void delete(FruitFW fruitFW);
}
