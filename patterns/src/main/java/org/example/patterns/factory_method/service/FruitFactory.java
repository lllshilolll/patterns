package org.example.patterns.factory_method.service;

import org.example.patterns.factory_method.domain.FruitFM;
import org.example.patterns.factory_method.domain.FruitTypeFM;

public interface FruitFactory {

    FruitFM create(FruitTypeFM type);
}
