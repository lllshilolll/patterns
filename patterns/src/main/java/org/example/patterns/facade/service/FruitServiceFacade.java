package org.example.patterns.facade.service;

import org.example.patterns.facade.domain.AbstractFruitF;

import java.util.List;

public interface FruitServiceFacade {

    List<AbstractFruitF> getFruitsByCount(int count);
}
