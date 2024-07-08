package org.example.patterns.proxy.service;

import org.example.patterns.proxy.domain.FruitP;

public interface FruitServiceProxy {

    FruitP add(FruitP fruitP);

    FruitP update(FruitP fruitP);

    void delete(FruitP fruitP);
}
