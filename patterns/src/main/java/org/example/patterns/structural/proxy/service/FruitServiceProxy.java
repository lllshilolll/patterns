package org.example.patterns.structural.proxy.service;

import org.example.patterns.structural.proxy.domain.FruitP;

public interface FruitServiceProxy {

    FruitP add(FruitP fruitP);

    FruitP update(FruitP fruitP);

    void delete(FruitP fruitP);
}
