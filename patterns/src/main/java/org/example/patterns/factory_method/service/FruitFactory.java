package org.example.patterns.factory_method.service;

import org.example.patterns.factory_method.domain.Fruit;
import org.example.patterns.factory_method.domain.FruitType;

public interface FruitFactory {

    Fruit create(FruitType type);
}
