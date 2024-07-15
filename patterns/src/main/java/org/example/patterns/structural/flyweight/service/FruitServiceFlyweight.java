package org.example.patterns.structural.flyweight.service;

import org.example.patterns.structural.flyweight.domain.FruitFW;

public interface FruitServiceFlyweight {

    FruitFW add(FruitFW fruitFW);

    FruitFW get(String name);
}
