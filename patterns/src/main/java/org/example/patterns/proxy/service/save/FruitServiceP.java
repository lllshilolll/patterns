package org.example.patterns.proxy.service.save;

import org.example.patterns.proxy.domain.FruitP;

public interface FruitServiceP {

    FruitP add(FruitP fruitP);

    FruitP update(FruitP fruitP);

    void delete(FruitP fruitP);
}
