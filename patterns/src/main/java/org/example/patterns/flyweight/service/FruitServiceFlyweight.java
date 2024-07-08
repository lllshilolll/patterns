package org.example.patterns.flyweight.service;

import org.example.patterns.flyweight.domain.FruitFW;

public interface FruitServiceFlyweight {

    FruitFW add(FruitFW fruitFW);

    FruitFW get(String name);
}
