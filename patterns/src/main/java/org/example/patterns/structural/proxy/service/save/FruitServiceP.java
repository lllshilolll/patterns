package org.example.patterns.structural.proxy.service.save;

import org.example.patterns.structural.proxy.domain.FruitP;

public interface FruitServiceP {

    FruitP add(FruitP fruitP);

    FruitP update(FruitP fruitP);

    void delete(FruitP fruitP);
}
