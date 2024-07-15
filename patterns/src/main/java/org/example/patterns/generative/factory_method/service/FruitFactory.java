package org.example.patterns.generative.factory_method.service;

import org.example.patterns.generative.factory_method.domain.FruitFM;
import org.example.patterns.generative.factory_method.domain.FruitTypeFM;

public interface FruitFactory {

    FruitFM create(FruitTypeFM type);
}
